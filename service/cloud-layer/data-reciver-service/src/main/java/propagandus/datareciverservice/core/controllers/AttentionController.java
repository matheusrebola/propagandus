package propagandus.datareciverservice.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {
  //private final AttentionMapper attentionMapper;
  //private final AttentionService attentionService;

  /* 
  @PostMapping
  public ResponseEntity<AttentionDTO> create(@RequestBody AttentionCreateDTO requestDTO){
    Attention attention = attentionMapper.map(requestDTO);
    Attention attentionSaved = attentionService.insert(attention);
    AttentionDTO responseDTO = attentionMapper.map(attentionSaved);
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<AttentionDTO>> getAll(){
    List<AttentionDTO> result = attentionService.findAll().stream().map(attentionMapper::map).collect(Collectors.toList());
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
  */
}
