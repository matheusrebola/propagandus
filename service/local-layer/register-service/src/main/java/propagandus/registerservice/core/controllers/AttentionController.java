package propagandus.registerservice.core.controllers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.Attention;
import propagandus.registerservice.core.dtos.AttentionCreateDTO;
import propagandus.registerservice.core.dtos.AttentionDTO;
import propagandus.registerservice.core.mappers.AttentionMapper;
import propagandus.registerservice.core.services.AttentionService;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {
  private final AttentionMapper attentionMapper;
  private final AttentionService attentionService;

  public ResponseEntity<AttentionDTO> create(@RequestBody AttentionCreateDTO requestDTO){
    Attention attention = attentionMapper.map(requestDTO);
    attention.periodRegister();
    LocalDateTime.now();
    Attention attentionSaved = attentionService.insert(attention);
    AttentionDTO responseDTO = attentionMapper.map(attentionSaved);
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
  }
}
