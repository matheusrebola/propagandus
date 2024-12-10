package propagandus.attentionservice.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import propagandus.attentionservice.core.models.enumerators.EReactionType;

@Entity(name = "reaction")
@Table(name = "reaction_table")
public record Reaction(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "reaction_id") Long id,
  @Enumerated(EnumType.STRING) @Column(length = 10, nullable = false) EReactionType reactionType,
  @OneToOne @JoinColumn(name = "period_time_id", referencedColumnName = "period_register_id", nullable = false) PeriodRegister reactionTime,
  @ManyToOne @JoinColumn(name = "advertising_id", nullable = false) Advertising advertising,
  @ManyToOne @JoinColumn(name = "location_id", nullable = false) Location location,
  @ManyToOne @JoinColumn(name = "painel_id", nullable = false) Painel painel
  ) {
}