package propagandus.persistenceservice.core.consumers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.persistenceservice.core.dtos.ReconhecimentoDTO;
import propagandus.persistenceservice.core.mappers.PersisteciaMapper;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.services.PersistenciaService;
import propagandus.persistenceservice.infra.rabbitmq.RabbitConfig;

@Component
@RequiredArgsConstructor
@Slf4j
public class ReconhecimentoConsumer {

    private final PersisteciaMapper mapper;
    private final PersistenciaService service;

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receberReconhecimento(ReconhecimentoCreateDTO dto) {
        try {
            log.info("Mensagem recebida do RabbitMQ: {}", dto);
            Local local = service.salvar(mapper.map(dto));
            ReconhecimentoDTO reconhecimento = mapper.map(local.getId(), dto);
            service.salvar(mapper.map(reconhecimento));

            log.info("Reconhecimento processado com sucesso.");
        } catch (Exception e) {
            log.error("Erro ao processar mensagem do RabbitMQ", e);
            // Aqui você pode tratar retries, dead-letter queues, etc.
            throw e;
        }
    }
}
