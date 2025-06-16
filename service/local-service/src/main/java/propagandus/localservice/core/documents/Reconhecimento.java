package propagandus.localservice.core.documents;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import propagandus.localservice.core.documents.enums.EAtencao;
import propagandus.localservice.core.documents.enums.EIdade;
import propagandus.localservice.core.documents.enums.ESexo;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reconhecimento")
public class Reconhecimento {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  private String data;
  private String local;
  private String token;

  @Enumerated(EnumType.STRING)
  private ESexo sexo;

  @Enumerated(EnumType.STRING)
  private EIdade idade;

  @Enumerated(EnumType.STRING)
  private EAtencao atencao;
}
