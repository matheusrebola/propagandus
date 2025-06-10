package propagandus.persistenceservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.LocalDTO;
import propagandus.persistenceservice.core.models.Local;

@Component
public class LocalMapper {

    public Local map(LocalDTO dto){
        return Local.builder()
                .zona(dto.getZona())
                .local(dto.getLocal())
                .detalhes(dto.getDetalhes())
                .build();
    }
}
