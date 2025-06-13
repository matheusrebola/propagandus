package propagandus.persistenceservice.core.consumers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.ReconhecimentoDTO;
import propagandus.persistenceservice.core.mappers.PersisteciaMapper;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.services.AuthService;
import propagandus.persistenceservice.core.services.PersistenciaService;
import propagandus.persistenceservice.infra.exception.ValidationException;
import propagandus.persistenceservice.infra.rabbitmq.RabbitConfig;

import java.util.Optional;

@Component
@RequiredArgsConstructor
@Slf4j
public final class ReconhecimentoConsumer {
    private final PersisteciaMapper mapper;
    private final PersistenciaService persistenceService;
    private final AuthService authService;

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receberReconhecimento(ReconhecimentoDTO dto) {
        try {
            authService.validateToken(dto.getToken());
            try {
                Optional<Local> local = persistenceService.encontrarLocal(dto.getLocal());
                if (local.isEmpty()) {
                    log.error("ID de Local não encontrado: {}", dto.getLocal());
                    return; // Encerra o processamento da mensagem
                }
                log.info("Mensagem recebida do RabbitMQ: {}", dto);
                persistenceService.salvar(mapper.map(dto, local));
                log.info("Reconhecimento processado com sucesso.");
            } catch (RuntimeException e) {
                log.error("Erro ao processar mensagem do RabbitMQ", e);
                throw new RuntimeException(e);
            }
        } catch (ValidationException e) {
            throw new ValidationException("Token Inválido");
        }
    }
}
