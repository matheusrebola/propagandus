package propagandus.backupservice.core.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Location(
  @Id Long id,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String country,
  @OneToMany(mappedBy ="location") Reaction reaction,
  @OneToMany(mappedBy ="painel") Painel painel
  ) {
}