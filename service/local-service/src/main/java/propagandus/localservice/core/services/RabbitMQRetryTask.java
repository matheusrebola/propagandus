package propagandus.localservice.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.AmqpException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.mappers.ReconhecimentoMapper;
import propagandus.localservice.core.producers.SagaProducer;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RabbitMQRetryTask {
    private final ReconhecimentoService service;
    private final SagaProducer producer;
    private final ReconhecimentoMapper mapper;

    @Scheduled(fixedRate = 60 * 1000) // a cada 30 minutos
    public void reenviarParaFila() {
        List<Reconhecimento> pendentes = service.encontrarTodos();

        for (Reconhecimento reconhecimento : pendentes) {
            try {
                producer.enviarReconhecimento(mapper.map(reconhecimento));
                service.deletarPeloId(reconhecimento.getId());
            } catch (AmqpException e) {
                break; // Interrompe o loop se o RabbitMQ estiver fora
            }
        }
    }
}
