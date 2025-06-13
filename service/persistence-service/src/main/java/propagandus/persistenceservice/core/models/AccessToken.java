package propagandus.persistenceservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "token_tb")
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class AccessToken {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String localId;
    private String tokenJwt;
}
