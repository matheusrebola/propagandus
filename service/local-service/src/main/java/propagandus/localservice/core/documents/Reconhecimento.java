package propagandus.localservice.core.documents;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

@Data
@Builder
public class Reconhecimento {
  private LocalDateTime data;
  private Local local;
  private ESexo sexo;
  private EIdade idade;
  private EAtencao atencao;
}
