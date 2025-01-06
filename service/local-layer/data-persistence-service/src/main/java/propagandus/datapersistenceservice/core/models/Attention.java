package propagandus.datapersistenceservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import propagandus.datapersistenceservice.core.models.enumerators.EAttentionLevel;
import propagandus.datapersistenceservice.core.models.enumerators.ESEx;

@Entity(name = "attention")
public record Attention(
  @Id @Column(name = "attention_id") @GeneratedValue(strategy = GenerationType.AUTO) Integer id,
  @Enumerated(EnumType.STRING)@Column(name = "attention_level", length = 15) EAttentionLevel attentionLevel,
  @Column(name = "attention_value") Byte attentionValue,
  @Column(name = "look_count") Short lookCount,
  @Column(name = "people_count") Short peopleCount,
  @Column(name = "people_sex", length = 4) @Enumerated(EnumType.STRING) ESEx sex,
  @Column(name = "attention_time") LocalDateTime attentionTime,
  @Column(name = "location_id", nullable = false) Integer locationId,
  @Column(name="painel_id", nullable = false) Integer painelId,
  @Column(name="advertising_id", nullable = false) Integer advertisingId
) {

}
