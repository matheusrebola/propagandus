package propagandus.persistenceservice.core.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.dtos.TokenDTO;
import propagandus.persistenceservice.core.models.AccessToken;
import propagandus.persistenceservice.core.repositories.AccessTokenRepository;
import propagandus.persistenceservice.infra.exception.ValidationException;

import java.util.UUID;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
@AllArgsConstructor
public class AuthService {
    private final AccessTokenRepository accessTokenRepository;

    public TokenDTO createToken() {
        return new TokenDTO(UUID.randomUUID().toString());
    }

    public void validateToken(String accessToken) {
        validateExistingToken(accessToken);
        AccessToken token = accessTokenRepository.findByToken(accessToken);
        isEmpty(token);
    }

    private void validateExistingToken(String accessToken) {
        if (isEmpty(accessToken)) {
            throw new ValidationException("The access token must be informed!");
        }
    }
}
