package propagandus.persistenceservice.core.cache;

import lombok.*;
import propagandus.persistenceservice.core.models.enums.ELocal;
import propagandus.persistenceservice.core.models.enums.EZona;

import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class LocalCache implements Serializable {
    private String id;
    private EZona zona;
    private ELocal local;
    private String latitude;
    private String longitude;
    private String detalhes;
}
