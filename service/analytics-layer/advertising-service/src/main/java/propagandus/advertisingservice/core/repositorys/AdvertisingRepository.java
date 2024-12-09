package propagandus.advertisingservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.models.Advertising;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising, Long> {
  String findByName(String name);
  List<String> findByCompany(String company);
  List<String> findByProduct(String product);
}
