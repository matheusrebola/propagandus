package propagandus.persistenceservice.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import propagandus.persistenceservice.core.dtos.AccessTokenDTO;
import propagandus.persistenceservice.core.dtos.LocalDTO;
import propagandus.persistenceservice.core.mappers.LocalMapper;
import propagandus.persistenceservice.core.services.PersistenciaService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/local")
public final class LocalController {
    private final PersistenciaService service;
    private final LocalMapper mapper;

    @PostMapping
    private ResponseEntity<AccessTokenDTO> criar(@RequestBody LocalDTO dto){
        try {
            return new ResponseEntity<>(service.salvar(mapper.map(dto)), HttpStatus.CREATED);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
