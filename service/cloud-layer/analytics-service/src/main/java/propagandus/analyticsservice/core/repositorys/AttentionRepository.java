package propagandus.analyticsservice.core.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.analyticsservice.core.models.Attention;
import propagandus.analyticsservice.core.models.enumerators.EAttentionLevel;

@Repository
public interface AttentionRepository extends JpaRepository<Attention, Long> {
  List<EAttentionLevel> findByAttention(EAttentionLevel attention);
  List<Byte> findByAttentionLevel(Byte attention);
  List<Short> findByLookCount(Short lookCount);
  List<Short> findByPeopleCount(Short peopleCount);
}
