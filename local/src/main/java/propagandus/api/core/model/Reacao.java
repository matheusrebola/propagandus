package propagandus.api.core.model;

import java.util.UUID;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;

@Entity
public record Reacao(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  @Enumerated(EnumType.STRING) EReacao tipoReacao,
  @ManyToOne @JoinColumn(name = "pessoa_id") Pessoa pessoa,
  @ManyToOne @JoinColumn(name = "horario_id") Horario horario,
  @Enumerated(EnumType.STRING) EAtencao nivelAtencao,
  LocalDateTime dataReacao,
  @ManyToOne @JoinColumn(name = "local_id") Local localReacao,
  @ManyToOne @JoinColumn(name = "painel_id") Painel painel,
  long tempoFixacao
) {

}
