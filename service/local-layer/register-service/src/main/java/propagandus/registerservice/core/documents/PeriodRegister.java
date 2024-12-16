package propagandus.registerservice.core.documents;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record PeriodRegister(
  @Id Integer id,
  UUID advertisingId,
  LocalDateTime registerTime
) {

}
