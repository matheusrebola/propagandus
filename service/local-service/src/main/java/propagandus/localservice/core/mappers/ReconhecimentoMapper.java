package propagandus.localservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.dtos.RespostaDTO;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ReconhecimentoMapper {

    public Reconhecimento map(ReconhecimentoCreateDTO dto) {
        return Reconhecimento.builder()
                .atencao(dto.getAtencao())
                .data(LocalDateTime.now())
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
}
