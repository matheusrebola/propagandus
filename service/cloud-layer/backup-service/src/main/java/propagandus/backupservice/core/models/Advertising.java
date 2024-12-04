package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Advertising(
  @Id Long id,
  String name,
  String version,
  String company,
  String product
) {

}
