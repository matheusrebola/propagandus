package propagandus.analiticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analiticsservice.core.models.PackageType;
import propagandus.analiticsservice.core.models.enumerators.EPackageType;

@Repository
public interface PackageTypeRepository extends JpaRepository<PackageType, Long> {
  List<EPackageType> findByPackageType(EPackageType packageType);
}
