package propagandus.datareciverservice.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reaction")
@RequiredArgsConstructor
public class ReactionController {
  //private final ReactionMapper reactionMapper;
  //private final ReactionService reactionService;

  /*
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
  */
}
