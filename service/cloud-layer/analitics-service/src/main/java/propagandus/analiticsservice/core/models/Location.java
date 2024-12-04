package propagandus.analiticsservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Location(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  String zipCode,
  String publicPlace,
  String number,
  String city,
  String state,
  String country,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
  List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true)
  List<Painel> paineis
  ) {
}
