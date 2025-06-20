package propagandus.localservice.core.mappers;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${spring.application.constants.localId}")
    private String localId;
    @Value("${spring.application.constants.token}")
    private String token;

    public Reconhecimento map(ReconhecimentoCreateDTO dto){
        return Reconhecimento.builder()
                .data(String.valueOf(LocalDateTime.now()))
                .local(localId)
                .token(token)
                .sexo(dto.getSexo())
                .idade(dto.getIdade())
                .atencao(dto.getAtencao())
                .build();
    }

    public static RespostaDTO map(){
        return RespostaDTO.builder()
                .id(UUID.randomUUID())
                .data(LocalDateTime.now())
                .build();
    }

    public List<ReconhecimentoDTO> map(List<Reconhecimento> reconhecimentos) {
        return reconhecimentos.stream().map(this::map).collect(Collectors.toList());
    }

    public ReconhecimentoDTO map(Reconhecimento reconhecimento){
        return ReconhecimentoDTO.builder()
                .id(reconhecimento.getId())
                .data(reconhecimento.getData())
                .local(reconhecimento.getLocal())
                .token(reconhecimento.getToken())
                .sexo(reconhecimento.getSexo())
                .idade(reconhecimento.getIdade())
                .atencao(reconhecimento.getAtencao())
                .build();
    }

}
