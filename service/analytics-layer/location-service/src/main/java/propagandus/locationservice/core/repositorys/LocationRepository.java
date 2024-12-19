package propagandus.locationservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.locationservice.core.models.Location;
import propagandus.locationservice.core.models.enumerators.ELocationType;
import propagandus.locationservice.core.views.LocationView;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long>, LocationView {
  //List<String> findByZipCode(String zipCode);
  //List<String> findByPublicPlace(String publicPlace);
  List<ELocationType> findByLocationType(ELocationType locationType);

  
}
