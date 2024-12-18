package propagandus.senderservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import propagandus.senderservice.core.models.enumerators.EReactionType;

@Entity(name = "reaction")
@Table(name = "reaction_table")
public record Reaction(
  @Id @Column(name = "reaction_id") Integer id,
  @Enumerated(EnumType.STRING) @Column(length = 10, name = "reaction_type") EReactionType reactionType,
  @Enumerated(EnumType.STRING) @Column(length = 10, name = "reaction_scale") Byte reactionScale,
  @Column(name = "reaction_date_time") LocalDateTime reactionTime,
  @Column(name = "advertising_id", nullable = false) Integer advertisingId,
  @Column(name = "location_id", nullable = false) Integer locationId,
  @Column(name = "painel_id", nullable = false) Integer painelId
  ) {
}
