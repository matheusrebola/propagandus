package propagandus.localservice.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.dtos.ReconhecimentoDTO;
import propagandus.localservice.core.dtos.RespostaDTO;
import propagandus.localservice.core.mappers.ReconhecimentoMapper;
import propagandus.localservice.core.services.ReconhecimentoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reconhecimento")
public class ReconhecimentoController {
    private final ReconhecimentoService service;
    private final ReconhecimentoMapper mapper;

    @PostMapping
    public ResponseEntity<RespostaDTO> criar(ReconhecimentoCreateDTO dto){
        try {
            service.registrarNaFila(mapper.toString(dto));
            return new ResponseEntity<>(ReconhecimentoMapper.map(), HttpStatus.CREATED);
        } catch (Exception e) {
            Reconhecimento reconhecimento = mapper.map(dto);
            service.salvar(reconhecimento);
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    public ResponseEntity<List<ReconhecimentoDTO>> encontrarTodos(){
        try {
            List<Reconhecimento> reconhecimentos = service.encontrarTodos();
            if (reconhecimentos.isEmpty() || reconhecimentos == null){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(mapper.map(reconhecimentos), HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
