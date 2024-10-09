package propagandus.api.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.service.HorarioService;

@RestController
@RequestMapping("/horarios")
@RequiredArgsConstructor
public class HorarioController {
  private final HorarioService horarioService;

  

}
