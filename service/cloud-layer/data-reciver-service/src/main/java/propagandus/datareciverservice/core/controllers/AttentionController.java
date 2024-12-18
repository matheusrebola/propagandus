package propagandus.datareciverservice.core.controllers;

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
import propagandus.datareciverservice.core.documents.Attention;
import propagandus.datareciverservice.core.dtos.AttentionCreateDTO;
import propagandus.datareciverservice.core.dtos.AttentionDTO;
import propagandus.datareciverservice.core.mappers.AttentionMapper;
import propagandus.datareciverservice.core.services.AttentionService;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {
  private final AttentionMapper attentionMapper;
  private final AttentionService attentionService;

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
