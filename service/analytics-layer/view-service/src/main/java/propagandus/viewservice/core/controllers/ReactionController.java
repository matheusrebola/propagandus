package propagandus.viewservice.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.ReactionAttentionCorrelation;
import propagandus.viewservice.core.services.ReactionService;

@RestController
@RequestMapping("/reaction")
@RequiredArgsConstructor
public class ReactionController {
  private final ReactionService reactionService;

  @GetMapping("/attention-correlation")
  public ResponseEntity<List<ReactionAttentionCorrelation>> locationPerformance(){
    List<ReactionAttentionCorrelation> result = reactionService.reactionAttentionCorrelation();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}