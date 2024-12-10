package propagandus.attentionservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.attentionservice.core.models.Attention;

import propagandus.attentionservice.core.views.AttentionView;

@Repository
public interface AttentionRepository extends JpaRepository<Attention, Long>, AttentionView{

}

