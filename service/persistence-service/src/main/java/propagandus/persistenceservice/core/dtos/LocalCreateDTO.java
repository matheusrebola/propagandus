package propagandus.persistenceservice.core.dtos;

import lombok.Data;
import propagandus.persistenceservice.core.models.enums.ELocal;
import propagandus.persistenceservice.core.models.enums.EZona;

@Data
public class LocalCreateDTO {
    private EZona endereco;
    private ELocal local;
}
