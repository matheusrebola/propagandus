package propagandus.localservice.core.dtos;

import lombok.Builder;
import lombok.Data;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

@Data
@Builder
public class ReconhecimentoDTO {
    private String id;
    private String data;
    private String local;
    private String token;
    private ESexo sexo;
    private EIdade idade;
    private EAtencao atencao;
}
