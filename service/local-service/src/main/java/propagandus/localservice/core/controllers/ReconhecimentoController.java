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
import propagandus.localservice.infra.excessoes.InfraForaException;

import java.time.LocalDateTime;
import java.util.List;

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
            return new ResponseEntity<>(mapper.map(), HttpStatus.CREATED);
        } catch (Exception e) {
            service.salvar(reconhecimento);
            throw new InfraForaException(e);
        } finally {
            List<Reconhecimento> listRecon = service.verificarBanco();
            service.deletarPeloId(listRecon);
            Reconhecimento registrar = service.registrarNaFila(listRecon);
            return new ResponseEntity<>(mapper.map(), HttpStatus.CREATED);
        }
    }
}
