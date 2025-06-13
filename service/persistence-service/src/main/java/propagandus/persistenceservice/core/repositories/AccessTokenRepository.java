package propagandus.persistenceservice.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import propagandus.persistenceservice.core.models.AccessToken;

@Repository
public interface AccessTokenRepository extends JpaRepository<AccessToken, Long> {
}
