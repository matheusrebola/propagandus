package propagandus.datapersistenceservice.core.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "advertising")
@Table(name = "advertising_table")
public record Advertising(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "advertising_id") Long id,
  @OneToOne @JoinColumn(name = "advertising_id", referencedColumnName = "advertising_info_id", nullable = false) AdvertisingInfo advertising,
  @OneToMany(mappedBy = "advertising", cascade = CascadeType.ALL, orphanRemoval = true) List<Reaction> reactions,
  @OneToMany(mappedBy = "advertising", cascade = CascadeType.ALL, orphanRemoval = true) List<PeriodRegister> advertisingTime,
  @ManyToOne @JoinColumn(name = "painel_id", nullable = false) Painel painel
) {
}