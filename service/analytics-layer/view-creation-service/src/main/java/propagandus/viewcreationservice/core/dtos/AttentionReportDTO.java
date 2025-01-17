package propagandus.viewcreationservice.core.dtos;

import java.time.DayOfWeek;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

public record AttentionReportDTO(
		String painelIdentification,
		EAttentionLevel attentionLevel,
		Byte attentionValue,
		Long lookCount,
		Long peopleCount,
		ESEx predominanteSex,
		Byte day,
		DayOfWeek dayWeek,
		Byte hour,
		Byte minute,
		EPeriodOfTheDay attentionPeriod
		) {

}
