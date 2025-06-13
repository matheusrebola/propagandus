package propagandus.persistenceservice.core.dtos;

import lombok.Data;
import propagandus.persistenceservice.core.models.enums.ELocal;
import propagandus.persistenceservice.core.models.enums.EZona;

@Data
public class LocalDTO {
    private EZona zona;
    private ELocal local;
    private String latitude;
    private String longitude;
    private String detalhes;
}
