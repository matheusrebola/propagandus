package propagandus.reactionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.reactionservice.core.models.PackageType;

@Repository
public interface PackageTypeRepository extends JpaRepository<PackageType, Long> {
}
