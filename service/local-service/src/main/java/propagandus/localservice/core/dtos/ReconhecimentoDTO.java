package propagandus.localservice.core.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReconhecimentoDTO {
    private String id;
    private String data;
    private String local;
    private String sexo;
    private String idade;
    private String atencao;
}
