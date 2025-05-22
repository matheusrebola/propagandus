package propagandus.localservice.core.dtos;

import propagandus.localservice.core.documents.Local;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

import java.time.LocalDateTime;

public record ReconhecimentoCreateDTO(
    LocalDateTime data,
    Local local,
    ESexo sexo,
    EIdade idade,
    EAtencao atencao
) {
}
