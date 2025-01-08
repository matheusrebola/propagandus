package propagandus.datalake.core.services.periodreaction;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import propagandus.datalake.core.dtos.PeriodRegisterCreateDto;

@Component
public class PeriodRegisterDtoFactory implements DateTimeProcessor {
	
	public PeriodRegisterCreateDto createFromDateTime(LocalDateTime time) {
		
		PeriodRegisterCreateDto createDto = new PeriodRegisterCreateDto(getDay(time),
				getDayOfWeek(time),
				getHour(time),
				getMinute(time),
				getPeriodOfDay(time),
				getMonth(time),
				getYear(time));
		
		return createDto;
    }
}
