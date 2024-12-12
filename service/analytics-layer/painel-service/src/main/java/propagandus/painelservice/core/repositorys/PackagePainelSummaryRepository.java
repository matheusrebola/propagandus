package propagandus.painelservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.painelservice.core.views.PackagePainelSummaryView;

public interface PackagePainelSummaryRepository extends JpaRepository<PackagePainelSummaryView, Long> {

}
