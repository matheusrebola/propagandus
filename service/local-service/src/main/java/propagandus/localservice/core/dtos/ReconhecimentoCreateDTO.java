package propagandus.localservice.core.dtos;

import lombok.Builder;
import lombok.Data;
import propagandus.localservice.core.documents.Local;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

@Data
@Builder
public class ReconhecimentoCreateDTO {
    private Local local;
    private ESexo sexo;
    private EIdade idade;
    private EAtencao atencao;
}
