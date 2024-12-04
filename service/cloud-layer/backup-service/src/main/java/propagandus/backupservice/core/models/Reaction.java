package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import propagandus.backupservice.core.models.enumerators.EReactionType;

@Entity
public record Reaction(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  @ManyToOne @JoinColumn(name = "advertising_id", nullable = false) Advertising advertising,
  @ManyToOne @JoinColumn(name = "location_id", nullable = false) Location location,
  @Enumerated(EnumType.STRING) EReactionType reactionType
  ) {
}
