package propagandus.localservice.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.AmqpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.dtos.ReconhecimentoDTO;
import propagandus.localservice.core.dtos.RespostaDTO;
import propagandus.localservice.core.mappers.ReconhecimentoMapper;
import propagandus.localservice.core.services.ReconhecimentoService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reconhecimento")
public class ReconhecimentoController {
    private final ReconhecimentoService service;
    private final ReconhecimentoMapper mapper;

    @PostMapping
    public ResponseEntity<RespostaDTO> criar(@RequestBody ReconhecimentoCreateDTO dto) {
        try {
            dto.setData(String.valueOf(LocalDateTime.now()));
            service.registrarNaFila(dto);  // Tenta publicar no RabbitMQ
            return new ResponseEntity<>(ReconhecimentoMapper.map(), HttpStatus.CREATED);
        } catch (AmqpException e) {
            Reconhecimento reconhecimento = mapper.map(dto);
            service.salvar(reconhecimento);
            return new ResponseEntity<>(ReconhecimentoMapper.map(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<ReconhecimentoDTO>> encontrarTodos(){
        try {
            List<Reconhecimento> reconhecimentos = service.encontrarTodos();
            if (reconhecimentos.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(mapper.map(reconhecimentos), HttpStatus.OK);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
