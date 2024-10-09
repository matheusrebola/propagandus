package propagandus.api.core.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public record Propaganda(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  String nome,
  String versao,
  String empresa,
  String produto,
  @ManyToOne @JoinColumn(name = "horario_id") Horario horario,
  @ManyToOne @JoinColumn(name = "local_id") Local local,
  @OneToMany(mappedBy = "propaganda") List<Reacao> reacoes
) {

}
