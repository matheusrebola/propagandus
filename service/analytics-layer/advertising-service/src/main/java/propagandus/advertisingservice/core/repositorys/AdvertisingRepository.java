package propagandus.advertisingservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.advertisingservice.core.models.Advertising;
import propagandus.advertisingservice.core.views.CampaignEffectivenessView;
import propagandus.advertisingservice.core.views.ProductPreferencesView;

@Repository
public interface AdvertisingRepository extends JpaRepository<Advertising,Long>
  ,CampaignEffectivenessView
  ,ProductPreferencesView {}
