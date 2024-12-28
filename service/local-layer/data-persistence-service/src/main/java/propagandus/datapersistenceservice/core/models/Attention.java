package propagandus.datapersistenceservice.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import propagandus.datapersistenceservice.core.models.enumerators.EAttentionLevel;
import propagandus.datapersistenceservice.core.models.enumerators.ESEx;

@Entity(name = "attention")
@Table(name = "attention_table")
public record Attention(
  @Id @Column(name = "attention_id") Integer id,
  @Enumerated(EnumType.STRING) @Column(name = "attention_level") EAttentionLevel attentionLevel,
  @Column(name = "attention_value") Byte attentionValue,
  @Column(name = "look_count") Short lookCount,
  @Column(name = "people_count") Short peopleCount,
  @Column(name = "people_sex") @Enumerated(EnumType.STRING) ESEx sex,
  @Column(name = "attention_date_time") LocalDateTime attentionTime,
  @Column(name = "people_count") Integer locationId,
  @Column(name="advertising_id", nullable=false) Integer advertisingId,
  @Column(name="painel_id", nullable=false) Integer painelId
) {

}
