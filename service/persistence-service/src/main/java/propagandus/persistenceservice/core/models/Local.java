package propagandus.persistenceservice.core.documents;

import lombok.Data;
import propagandus.persistenceservice.core.documents.enums.ELocal;
import propagandus.persistenceservice.core.documents.enums.EZona;

@Data
public class Local {
  private EZona endereco;
  private ELocal local;
}
