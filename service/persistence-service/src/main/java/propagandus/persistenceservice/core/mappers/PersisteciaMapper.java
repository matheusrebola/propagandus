package propagandus.persistenceservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.LocalCreateDTO;
import propagandus.persistenceservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.persistenceservice.core.dtos.ReconhecimentoDTO;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.models.Reconhecimento;

@Component
public class PersisteciaMapper {

    public Local map(LocalCreateDTO dto){
        return Local.builder()
                .zona(dto.getZona())
                .local(dto.getLocal())
                .build();
    }

    public ReconhecimentoDTO map(Long localId, ReconhecimentoCreateDTO dto){
        return ReconhecimentoDTO.builder()
                .data(dto.getData())
                .local(localId)
                .sexo(dto.getSexo())
                .idade(dto.getIdade())
                .atencao(dto.getAtencao())
                .build();
    }

    public Reconhecimento map(ReconhecimentoDTO dto){
        return Reconhecimento.builder()
                .data(dto.getData())
                .local(dto.getLocal())
                .sexo(dto.getSexo())
                .idade(dto.getIdade())
                .atencao(dto.getAtencao())
                .build();
    }

    public Local map(ReconhecimentoCreateDTO dto){
        return map(dto.getLocal());
    }

}
