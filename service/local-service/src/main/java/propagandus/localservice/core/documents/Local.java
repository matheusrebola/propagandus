package propagandus.localservice.core.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import propagandus.localservice.core.documents.enums.ELocal;
import propagandus.localservice.core.documents.enums.EZona;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Local {
  private EZona zona;
  private ELocal local;
  private String nome;
  private String propaganda;
}
