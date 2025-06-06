package propagandus.localservice.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.dtos.RespostaDTO;
import propagandus.localservice.core.mappers.ReconhecimentoMapper;
import propagandus.localservice.core.services.ReconhecimentoService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reconhecimento")
public class ReconhecimentoController {
    private final ReconhecimentoService service;
    private final ReconhecimentoMapper mapper;

    @PostMapping
    public ResponseEntity<RespostaDTO> criar(ReconhecimentoCreateDTO dto){
        Reconhecimento reconhecimento = mapper.map(dto);
        try {
            service.registrarNaFila(reconhecimento);
            return new ResponseEntity<>(ReconhecimentoMapper.map(), HttpStatus.CREATED);
        } catch (Exception e) {
            service.salvar(reconhecimento);
            throw new RuntimeException(e);
        }
    }

}
