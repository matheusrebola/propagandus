package propagandus.persistenceservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.ReconhecimentoDTO;
import propagandus.persistenceservice.core.models.Reconhecimento;

@Component
public class PersisteciaMapper {

    public Reconhecimento map(ReconhecimentoDTO dto){
        return Reconhecimento.builder()
                .data(dto.getData())
                .local(dto.getLocal())
                .sexo(dto.getSexo())
                .idade(dto.getIdade())
                .atencao(dto.getAtencao())
                .build();
    }

}
