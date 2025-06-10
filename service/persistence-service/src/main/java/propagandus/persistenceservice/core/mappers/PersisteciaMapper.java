package propagandus.persistenceservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.ReconhecimentoDTO;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.models.Reconhecimento;

@Component
public class PersisteciaMapper {

    public Reconhecimento map(ReconhecimentoDTO dto, Local local){
        return Reconhecimento.builder()
                .data(dto.getData())
                .local(local)
                .sexo(dto.getSexo())
                .idade(dto.getIdade())
                .atencao(dto.getAtencao())
                .build();
    }

}
