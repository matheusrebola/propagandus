package propagandus.registerservice.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import propagandus.registerservice.core.documents.PeriodRegister;
import propagandus.registerservice.core.dtos.PeriodRegisterCreateDTO;
import propagandus.registerservice.core.dtos.PeriodRegisterDTO;
import propagandus.registerservice.core.mappers.PeriodRegisterMapper;
import propagandus.registerservice.core.services.PeriodRegisterService;

@RestController
@RequestMapping("/date-time")
@RequiredArgsConstructor
public class PeriodRegisterController {
  private final PeriodRegisterMapper periodRegisterMapper;
  private final PeriodRegisterService periodRegisterService;

  @PostMapping
  public ResponseEntity<PeriodRegisterDTO> create(@RequestBody PeriodRegisterCreateDTO requestDTO){
    PeriodRegister periodRegister = periodRegisterMapper.map(requestDTO);
    PeriodRegister periodRegisterSaved = periodRegisterService.insert(periodRegister);
    PeriodRegisterDTO responseDTO = periodRegisterMapper.map(periodRegisterSaved);
    return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
  }
}
