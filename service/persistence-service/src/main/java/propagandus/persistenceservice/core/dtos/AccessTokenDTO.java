package propagandus.persistenceservice.core.dtos;

import lombok.Builder;

@Builder
public record AccessTokenDTO(String localId, String tokenJwt) {
}
