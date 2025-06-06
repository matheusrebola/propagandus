package propagandus.localservice.core.documents;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

@Data
@Builder
@Document(collection = "reconhecimentos")
public class Reconhecimento {
  @Id
  private String id;
  private String data;
  private Local local;
  private ESexo sexo;
  private EIdade idade;
  private EAtencao atencao;
}
