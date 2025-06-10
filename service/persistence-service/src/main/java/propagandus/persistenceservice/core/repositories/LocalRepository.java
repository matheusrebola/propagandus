package propagandus.persistenceservice.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import propagandus.persistenceservice.core.models.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local,String> {
}
