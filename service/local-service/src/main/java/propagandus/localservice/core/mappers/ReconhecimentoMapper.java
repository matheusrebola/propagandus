package propagandus.localservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.dtos.ReconhecimentoDTO;
import propagandus.localservice.core.dtos.RespostaDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class ReconhecimentoMapper {

    public Reconhecimento map(ReconhecimentoCreateDTO dto) {
        return Reconhecimento.builder()
                .atencao(dto.getAtencao())
                .data(LocalDateTime.now().toString())
                .idade(dto.getIdade())
                .local(dto.getLocal())
                .sexo(dto.getSexo())
                .build();
    }

    public static RespostaDTO map(){
        return RespostaDTO.builder()
                .id(UUID.randomUUID())
                .data(LocalDateTime.now())
                .build();
    }

    public List<ReconhecimentoDTO> map(List<Reconhecimento> reconhecimentos) {
        return reconhecimentos.stream().map(recon -> map(recon)).collect(Collectors.toList());
    }

    public ReconhecimentoDTO map(Reconhecimento reconhecimento){
        return ReconhecimentoDTO.builder()
                .id(reconhecimento.getId())
                .data(reconhecimento.getData())
                .local(reconhecimento.getLocal().toString())
                .sexo(reconhecimento.getSexo().toString())
                .idade(reconhecimento.getIdade().toString())
                .atencao(reconhecimento.getAtencao().toString())
                .build();
    }

    public ReconhecimentoDTO toString(ReconhecimentoCreateDTO dto){
        return ReconhecimentoDTO.builder()
                .local(dto.getLocal().toString())
                .sexo(dto.getSexo().toString())
                .idade(dto.getIdade().toString())
                .atencao(dto.getAtencao().toString())
                .build();
    }
}
