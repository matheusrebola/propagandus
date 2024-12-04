package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import propagandus.backupservice.core.models.enumerators.EReactionType;

@Entity
public record Reaction(
  @Id Long id,
  @ManyToOne Advertising advertising,
  @ManyToOne Location location,
  @Enumerated EReactionType reactionType
  ) {
}
