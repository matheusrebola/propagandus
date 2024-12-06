package propagandus.analyticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analyticsservice.core.models.Advertising;
import propagandus.analyticsservice.core.views.AdvertisingView;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising, Long>, AdvertisingView {
  String findByName(String name);
  List<String> findByCompany(String company);
  List<String> findByProduct(String product);
}
