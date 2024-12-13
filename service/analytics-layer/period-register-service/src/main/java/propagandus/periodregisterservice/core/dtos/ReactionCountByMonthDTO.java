package propagandus.periodregisterservice.core.dtos;

import propagandus.periodregisterservice.core.models.enumerators.EMonth;

public record ReactionCountByMonthDTO(
  EMonth month,
  Integer reactionCount
) {}
