package propagandus.viewservice.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.AttentionByAudience;
import propagandus.viewservice.core.services.AttentionService;

@RestController
@RequestMapping("/attention")
@RequiredArgsConstructor
public class AttentionController {
  private final AttentionService attentionService;

  @GetMapping("/by-audience")
  public ResponseEntity<List<AttentionByAudience>> attentionByAudience(){
    List<AttentionByAudience> result = attentionService.attentionByAudience();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
