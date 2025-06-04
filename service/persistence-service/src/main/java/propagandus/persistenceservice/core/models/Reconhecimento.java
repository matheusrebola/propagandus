package propagandus.persistenceservice.core.documents;

import lombok.Data;
import propagandus.persistenceservice.core.documents.enums.EAtencao;
import propagandus.persistenceservice.core.documents.enums.EIdade;
import propagandus.persistenceservice.core.documents.enums.ESexo;

@Data
public class Reconhecimento {
  private String data;
  private Local local;
  private ESexo sexo;
  private EIdade idade;
  private EAtencao atencao;
}
