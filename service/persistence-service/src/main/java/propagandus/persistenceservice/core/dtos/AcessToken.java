package propagandus.persistenceservice.core.dtos;

import lombok.Builder;

@Builder
public record AcessToken(String localId, String tokenJwt) {
}
