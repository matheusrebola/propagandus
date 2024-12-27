package propagandus.staticregisterservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.staticregisterservice.core.models.Advertising;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising,Long> {

}
