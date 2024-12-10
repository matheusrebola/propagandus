package propagandus.datalake.core.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import propagandus.datalake.core.models.enumerators.EActionType;

@Entity(name = "change_log")
@Table(name = "change_log")
public record ChangeLog(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "advertising_id") Long id,
  @Column(name = "table_name", length = 20, nullable = false)String tableName,
  @Enumerated(EnumType.STRING) @Column(name = "action_type", length = 7, nullable = false) EActionType actionType,
  @Column(name = "primary_key_value", length = 20, nullable = false) String primaryKeyValue,
  @Column(name = "changed_at", length = 20, nullable = false) LocalDateTime changedAt
) {

}
