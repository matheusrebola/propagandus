package propagandus.staticregisterservice.core.models;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "advertising")
@Table(name = "advertising_table")
public record Advertising(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "advertising_id") Long id,
  @Column(length = 20, nullable = false, name = "advertising_name") String name,
  @Column(length = 4, nullable = false, name = "advertising_version") String version,
  @Column(length = 50, nullable = false, name = "advertising_company") String company,
  @Column(length = 20, nullable = false) String product,
  @Column(length = 20, nullable = false, name = "creation_date_time") LocalDateTime creationTime
) {
}