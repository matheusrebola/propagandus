package propagandus.analiticsservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Advertising(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
  String name,
  String version,
  String company,
  String product,
  @OneToMany(mappedBy = "advertising", cascade = CascadeType.ALL, orphanRemoval = true)
  List<Reaction> reactions
) {
}