package propagandus.attentionservice.core.dtos;

import propagandus.attentionservice.core.models.enumerators.EPeriodOfTheDay;

public record PainelAttentionPeriodDTO(
  EPeriodOfTheDay period,
  Integer totalAttention
) {

}
