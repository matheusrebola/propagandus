package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Advertising(
  @Id Long id,
  String name,
  String version,
  String company,
  String product,
  @OneToMany(mappedBy = "reaction") Reaction reaction
) {

}
