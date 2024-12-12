package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import propagandus.advertisingservice.core.views.AdvertisingByPeriodView;

public interface AdvertisingByPeriodRepository extends JpaRepository<AdvertisingByPeriodView,Long> {

}
