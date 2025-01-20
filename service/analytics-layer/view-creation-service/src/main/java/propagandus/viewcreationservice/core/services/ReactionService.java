package propagandus.viewcreationservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.viewcreationservice.core.documents.ReactionAttentionCorrelation;
import propagandus.viewcreationservice.core.dtos.ReactionAttentionCorrelationDTO;
import propagandus.viewcreationservice.core.mappers.ReactionAttentionCorrelationMapper;
import propagandus.viewcreationservice.core.repositorys.ReactionRepository;
import propagandus.viewcreationservice.core.repositorys.mongo.ReactionAttentionCorrelationRepository;

@Service
@RequiredArgsConstructor
public class ReactionService extends AViewCreationService {
	  private final ReactionRepository reactionRepository;
	  private final ReactionAttentionCorrelationMapper reactionAttentionCorrelationMapper;
	  private final ReactionAttentionCorrelationRepository reactionAttentionCorrelationRepository;
	  
	  @Override
	  protected void executeProcess() {
		  reactionAttentionCorrelation();
	  }
	  
	  public void reactionAttentionCorrelation(){
	    List<ReactionAttentionCorrelationDTO> dtoList = reactionRepository.reactionAttentionCorrelation();
	    List<ReactionAttentionCorrelation> reactions = dtoList.stream()
	      .map(reactionAttentionCorrelationMapper::map)
	      .toList();
	    reactionAttentionCorrelationRepository.saveAll(reactions);
	  }

	@Override
	public void clearDatabase() {
		// TODO Auto-generated method stub
		
	}

}
