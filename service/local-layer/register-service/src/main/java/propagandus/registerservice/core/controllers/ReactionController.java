package propagandus.registerservice.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.Reaction;
import propagandus.registerservice.core.dtos.ReactionCreateDTO;
import propagandus.registerservice.core.dtos.ReactionDTO;
import propagandus.registerservice.core.mappers.ReactionMapper;
import propagandus.registerservice.core.services.ReactionService;

@RestController
@RequestMapping("/reaction")
@RequiredArgsConstructor
public class ReactionController {
  private final ReactionMapper reactionMapper;
  private final ReactionService reactionService;

  @PostMapping
  public ResponseEntity<ReactionDTO> create(@RequestBody ReactionCreateDTO requestDTO){
    Reaction reaction = reactionMapper.map(requestDTO);
    Reaction reactionSaved = reactionService.insert(reaction);
    ReactionDTO responseDTO = reactionMapper.map(reactionSaved);
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<ReactionDTO>> getAll(){
    List<ReactionDTO> result = reactionService.findAll().stream().map(reactionMapper::map).collect(Collectors.toList());
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
