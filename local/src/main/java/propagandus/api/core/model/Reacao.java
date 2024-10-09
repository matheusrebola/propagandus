package propagandus.api.core.model;

import java.util.UUID;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;

@Entity
public record Reacao(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  EReacao tipoReacao,
  Pessoa pessoa,
  Horario horario,
  EAtencao nivelAtencao,
  LocalDateTime dataReacao
) {

}
