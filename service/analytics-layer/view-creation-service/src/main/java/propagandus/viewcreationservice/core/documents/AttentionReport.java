package propagandus.viewcreationservice.core.documents;

import java.time.DayOfWeek;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import propagandus.viewcreationservice.core.models.enumerators.EAttentionLevel;
import propagandus.viewcreationservice.core.models.enumerators.EPeriodOfTheDay;
import propagandus.viewcreationservice.core.models.enumerators.ESEx;

@Document
public record AttentionReport(
		@Id Long id,
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
