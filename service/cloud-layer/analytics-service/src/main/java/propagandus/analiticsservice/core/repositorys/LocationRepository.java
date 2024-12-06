package propagandus.analiticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
  List<String> findByZipCode (String zipCode);
  List<String> findByPublicPlace (String publicPlace);
  List<String> findByPublicPlaceAndNumber(String publicPlace, String number);
}