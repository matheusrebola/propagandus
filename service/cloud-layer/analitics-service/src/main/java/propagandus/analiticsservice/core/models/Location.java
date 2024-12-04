package propagandus.analiticsservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Location(@Id Long id) {

}
