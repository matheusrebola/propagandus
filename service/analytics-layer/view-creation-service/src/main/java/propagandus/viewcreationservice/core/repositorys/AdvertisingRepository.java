package propagandus.viewcreationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.models.Advertising;
import propagandus.viewcreationservice.core.views.generics.AdvertisingView;

@Repository
public interface AdvertisingRepository extends JpaRepository <Advertising,Long>, AdvertisingView {
	
}
