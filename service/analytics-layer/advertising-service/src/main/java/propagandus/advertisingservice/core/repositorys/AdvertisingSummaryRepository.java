package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.advertisingservice.core.views.AdvertisingSummaryView;

public interface AdvertisingSummaryRepository extends JpaRepository<AdvertisingSummaryView,Long>{

}
