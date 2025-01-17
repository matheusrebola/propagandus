package propagandus.viewcreationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.models.Location;
import propagandus.viewcreationservice.core.views.generics.LocationView;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long>, LocationView {
 
}
