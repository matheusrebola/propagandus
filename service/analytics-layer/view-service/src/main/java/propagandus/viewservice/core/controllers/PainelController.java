package propagandus.viewservice.core.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.viewservice.core.documents.PainelPerformance;
import propagandus.viewservice.core.services.PainelService;

@RestController
@RequestMapping("/painel")
@RequiredArgsConstructor
public class PainelController {
  private final PainelService painelService;

  @GetMapping("/by-audience")
  public ResponseEntity<List<PainelPerformance>> painelPerformance(){
    List<PainelPerformance> result = painelService.painelPerformance();
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}