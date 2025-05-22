package propagandus.localservice.core.producers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class SagaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void enviarEvento(String payload, String topico){
        try {
            log.info("Sending event to topic {} with data {}", topico, payload);
            kafkaTemplate.send(topico, payload);
        } catch (Exception ex) {
            log.error("Error trying to send data to topic {} with data {}", topico, payload, ex);
        }
    }
}
