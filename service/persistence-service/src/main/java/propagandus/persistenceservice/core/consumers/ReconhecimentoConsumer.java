package propagandus.persistenceservice.core.consumers;

import lombok.RequiredArgsConstructor;
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
public class ReconhecimentoConsumer {
    private final PersisteciaMapper mapper;
    private final PersistenciaService service;

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receberReconhecimento(ReconhecimentoCreateDTO dto) {
        try {
            Local local = service.salvar(mapper.map(dto));
            ReconhecimentoDTO reconhecimento = mapper.map(local.getId(), dto);
            service.salvar(mapper.map(reconhecimento));
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }