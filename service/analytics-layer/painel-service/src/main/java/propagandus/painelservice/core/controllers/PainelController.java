package propagandus.painelservice.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.painelservice.core.models.Painel;
import propagandus.painelservice.core.models.enumerators.EStatus;

@RestController
@RequestMapping("/painel")
@RequiredArgsConstructor
public class PainelController {

  @GetMapping("{identification}")
  String findByIdentification(@PathVariable String identification){return null;}

  @GetMapping("{status}")
  List<EStatus> findByEStatus(@PathVariable EStatus status){return null;}

  @GetMapping("{model}")
  List<String> findByModel(@PathVariable String model){return null;}

  @GetMapping("/active/{city}")
  public List<Painel> findActivePainelsByCity(@PathVariable String city){return null;}

  @GetMapping("{city}")
  public List<Object[]> countInteractionsByPainelStatusInCity(@PathVariable String city){return null;}

  @GetMapping("/status/{status}/city/{city}")
  public List<Painel> findByStatusAndCity(@PathVariable EStatus status, @PathVariable String city){return null;}

  @GetMapping("/active/{model}")
  public List<Painel> findActivePainelsByModel(@PathVariable String model){return null;}

  @GetMapping("{level}")
  public List<Painel> findPainelsWithAttentionAboveLevel(@PathVariable Byte level){return null;}

  @GetMapping("{state}")
  public List<Object[]> countPainelsByModelInState(@PathVariable String state){return null;}

  @GetMapping("{hour}")
  public List<Object[]> findMostInteractivePainelsByHour(@PathVariable Byte hour){return null;}
}
