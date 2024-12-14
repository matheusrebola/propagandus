package propagandus.datapersistenceservice.core.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "location")
@Table(name = "location_table")
public record Location(
  @Id @GeneratedValue(strategy = GenerationType.UUID) @Column(name = "location_id") UUID id,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, orphanRemoval = true) List<Painel> painels
  ) {
}
