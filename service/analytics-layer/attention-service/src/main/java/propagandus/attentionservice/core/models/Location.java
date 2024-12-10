package propagandus.attentionservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import propagandus.attentionservice.core.models.enumerators.ELocationType;

@Entity(name = "location")
@Table(name = "location_table")
public record Location(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "location_id") Long id,
  @Column(length = 10, nullable = false, name = "zip_code") String zipCode,
  @Column(length = 45, nullable = false, name = "public_place") String publicPlace,
  @Column(length = 5, nullable = false) String number,
  @Column(length = 20, nullable = false, name = "location_type") ELocationType locationType,
  @Column(length = 45, nullable = false) String city,
  @Column(length = 4, nullable = false) String state,
  @Column(length = 20, nullable = false) String country,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Painel> paineis
  ) {
}