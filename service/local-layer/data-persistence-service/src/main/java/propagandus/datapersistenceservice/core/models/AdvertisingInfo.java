package propagandus.datapersistenceservice.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "advertising_info")
@Table(name = "advertising_info_table")
public record AdvertisingInfo(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "advertising_info_id") Byte id,
  @Column(length = 20, nullable = false) String name,
  @Column(length = 4, nullable = false) String version,
  @Column(length = 20, nullable = false) String company,
  @Column(length = 20, nullable = false) String product,
  @Column(length = 20, nullable = false, name = "exibition_time") Short exibitionTime,
  @OneToOne(mappedBy = "advertising") Advertising advertising
) {

}
