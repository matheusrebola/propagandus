package propagandus.persistenceservice.core.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.infra.exception.AuthenticationException;
import propagandus.persistenceservice.infra.exception.ValidationException;

import javax.crypto.SecretKey;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

import static org.springframework.util.ObjectUtils.isEmpty;


@Service
@RequiredArgsConstructor
public class JwtService {

    private static final String EMPTY_SPACE = " ";
    private static final Integer TOKEN_INDEX = 1;
    private static final Integer ONE_DAY_IN_HOURS = 24;

    @Value("${spring.application.token.secret-key}")
    private String secretKey;

    public String createToken() {
        var data = new HashMap<String, String>();
        return Jwts
                .builder()
                .claims(data)
                .signWith(generateSign())
                .compact();
    }

    public Date generateExpiresAt() {
        return Date.from(
                LocalDateTime.now()
                        .plusHours(ONE_DAY_IN_HOURS)
                        .atZone(ZoneId.systemDefault()).toInstant()
        );
    }

    public void validateAccessToken(String token) {
        var accessToken = extractToken(token);
        try {
            Jwts
                    .parser()
                    .verifyWith(generateSign())
                    .build()
                    .parseSignedClaims(accessToken)
                    .getPayload();
        } catch (Exception ex) {
            throw new AuthenticationException("Invalid token: " + ex.getMessage());
        }
    }

    private String extractToken(String token) {
        if (isEmpty(token)) {
            throw new ValidationException("The access token was not informed.");
        }
        if (token.contains(EMPTY_SPACE)) {
            return token.split(EMPTY_SPACE)[TOKEN_INDEX];
        }
        return token;
    }

    private SecretKey generateSign() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }
}
