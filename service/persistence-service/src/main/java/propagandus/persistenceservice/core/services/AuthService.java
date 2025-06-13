package propagandus.persistenceservice.core.services;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.dtos.AuthRequest;
import propagandus.persistenceservice.core.dtos.TokenDTO;
import propagandus.persistenceservice.core.repositories.UsuariosRepository;
import propagandus.persistenceservice.infra.exception.ValidationException;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
@AllArgsConstructor
public class AuthService {
    private final JwtService jwtService;
    private final UsuariosRepository repository;
    private final PasswordEncoder passwordEncoder;

    public TokenDTO login(AuthRequest request) {
        var user = repository
                .findByUsername(request.username())
                .orElseThrow(() -> new ValidationException("User not found!"));
        validatePassword(request.password(), user.getPassword());
        var accessToken = jwtService.createToken(user);
        return new TokenDTO(accessToken);
    }

    public TokenDTO createToken() {
        return new TokenDTO(jwtService.createToken());
    }

    private void validatePassword(String rawPassword, String encodedPassword) {
        if (!passwordEncoder.matches(rawPassword, encodedPassword)) {
            throw new ValidationException("The password is incorrect!");
        }
    }

    public TokenDTO validateToken(String accessToken) {
        validateExistingToken(accessToken);
        jwtService.validateAccessToken(accessToken);
        return new TokenDTO(accessToken);
    }

    private void validateExistingToken(String accessToken) {
        if (isEmpty(accessToken)) {
            throw new ValidationException("The access token must be informed!");
        }
    }
}
