package propagandus.viewcreationservice.core.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.viewcreationservice.core.models.Reaction;
import propagandus.viewcreationservice.core.views.generics.ReactionView;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction,Long>, ReactionView {
}
