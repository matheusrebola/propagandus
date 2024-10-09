package propagandus.api.core.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public record Painel(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  String painelId, // Identificador único do painel
  @ManyToOne
  Local localPainel
) {

}
