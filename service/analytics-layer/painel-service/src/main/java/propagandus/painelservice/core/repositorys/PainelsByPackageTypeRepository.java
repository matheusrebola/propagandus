package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.painelservice.core.views.PainelsByPackageTypeView;

public interface PainelsByPackageTypeRepository extends JpaRepository<PainelsByPackageTypeView, Long> {

}
