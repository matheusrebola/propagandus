package propagandus.persistenceservice.core.dtos;

import lombok.Builder;
import lombok.Data;
import propagandus.persistenceservice.core.models.enums.EAtencao;
import propagandus.persistenceservice.core.models.enums.EIdade;
import propagandus.persistenceservice.core.models.enums.ESexo;

import java.util.Date;

@Data
@Builder
public class ReconhecimentoCreateDTO {
    private Date data;
    private String local;
    private ESexo sexo;
    private EIdade idade;
    private EAtencao atencao;
}
