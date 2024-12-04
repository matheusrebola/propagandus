package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Reaction(@Id Long id) {

}
