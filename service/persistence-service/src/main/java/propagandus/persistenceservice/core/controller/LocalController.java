package propagandus.persistenceservice.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import propagandus.persistenceservice.core.dtos.LocalDTO;
import propagandus.persistenceservice.core.mappers.LocalMapper;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.services.PersistenciaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/local")
public final class LocalController {
    private final PersistenciaService service;
    private final LocalMapper mapper;

    @PostMapping
    private ResponseEntity<String> criar(@RequestBody LocalDTO dto){
        try {
            Local local = service.salvar(mapper.map(dto));
            return new ResponseEntity<>(local.getId(), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
