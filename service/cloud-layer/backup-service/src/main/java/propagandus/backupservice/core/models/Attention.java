package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Attention(
  @Id Long id
) {

}
