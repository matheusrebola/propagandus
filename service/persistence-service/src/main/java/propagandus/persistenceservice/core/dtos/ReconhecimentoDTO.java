package propagandus.persistenceservice.core.dtos;

import lombok.Builder;
import lombok.Data;
import propagandus.persistenceservice.core.models.enums.EAtencao;
import propagandus.persistenceservice.core.models.enums.EIdade;
import propagandus.persistenceservice.core.models.enums.ESexo;

@Data
@Builder
public class ReconhecimentoDTO {
    private String data;
    private Long local;
    private ESexo sexo;
    private EIdade idade;
    private EAtencao atencao;
}
