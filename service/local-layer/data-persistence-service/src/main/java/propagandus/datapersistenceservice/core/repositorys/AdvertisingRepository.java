package propagandus.datapersistenceservice.core.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.datapersistenceservice.core.models.Advertising;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising, UUID> {
}
