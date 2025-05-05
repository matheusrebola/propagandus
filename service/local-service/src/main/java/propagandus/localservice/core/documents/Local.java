package propagandus.localservice.core.documents;

import java.util.List;

import lombok.Data;
import propagandus.localservice.core.documents.enums.ELocal;
import propagandus.localservice.core.documents.enums.EZona;

@Data
public class Local {
  private EZona zona;
  private ELocal local;
  private String nome;
  private List<String> propaganda;
}
