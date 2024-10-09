package propagandus.api.core.model;

import org.hibernate.validator.constraints.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import propagandus.api.core.model.enums.EHorario;

@Entity
public record Horario(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  EHorario tipoHorario
) {

}
