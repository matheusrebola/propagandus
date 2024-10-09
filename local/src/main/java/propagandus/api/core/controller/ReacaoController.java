package propagandus.api.core.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import propagandus.api.core.dto.ReacaoCreateDto;
import propagandus.api.core.dto.ReacaoDto;
import propagandus.api.core.mapper.ReacaoMapper;
import propagandus.api.core.model.Reacao;
import propagandus.api.core.service.ReacaoService;

@RestController
@RequestMapping("/reacoes")
@RequiredArgsConstructor
public class ReacaoController {
  private final ReacaoService reacaoService;
  private final ReacaoMapper reacaoMapper;

  @PostMapping
  public ResponseEntity<ReacaoDto> create(@Valid @RequestBody ReacaoCreateDto createDto){
    Reacao reacao = reacaoMapper.map(createDto);
    Reacao reacaoSaved = reacaoService.save(reacao);
    ReacaoDto respondeDto = reacaoMapper.map(reacaoSaved);
    return new ResponseEntity<>(respondeDto, HttpStatus.CREATED);
  }

  @GetMapping
    public ResponseEntity<List<ReacaoDto>> getAll() {
        List<ReacaoDto> result = reacaoService.getAll().stream().map(reacaoMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
