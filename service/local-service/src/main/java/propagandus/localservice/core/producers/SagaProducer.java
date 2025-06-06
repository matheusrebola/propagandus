package propagandus.localservice.core.producers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import propagandus.localservice.core.dtos.ReconhecimentoDTO;
import propagandus.localservice.infra.rabbitmq.RabbitConfig;

@Component
@Slf4j
@RequiredArgsConstructor
public class SagaProducer {
    private final RabbitTemplate rabbitTemplate;

    public void enviarReconhecimento(ReconhecimentoDTO reconhecimento) {
        rabbitTemplate.convertAndSend(
                RabbitConfig.EXCHANGE,
                RabbitConfig.ROUTING_KEY,
                reconhecimento
        );
    }
}
