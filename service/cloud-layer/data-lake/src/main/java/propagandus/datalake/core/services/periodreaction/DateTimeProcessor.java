package propagandus.datalake.core.services.periodreaction;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;

public interface DateTimeProcessor {
	
	default Byte getDay(LocalDateTime time) {
		Byte day = (byte) time.getDayOfMonth();
		return day;
	}
	
	default DayOfWeek getDayOfWeek(LocalDateTime time) {
		DayOfWeek dayWeek = time.getDayOfWeek();
		return dayWeek;
	}
	
	default Byte getHour(LocalDateTime time) {
		Byte hour = (byte) time.getHour();
		return hour;
	}
	
	default Byte getMinute(LocalDateTime time) {
		Byte minute = (byte) time.getMinute();
		return minute;
	}
	
	default EPeriodOfTheDay getPeriodOfDay(LocalDateTime time) {
		int hour = time.getHour();
		if (hour >= 6 && hour <= 12) {
			return EPeriodOfTheDay.MORN;
		}
		else if (hour > 12 && hour <= 18) {
			return EPeriodOfTheDay.AFTER;
		}
		else if (hour > 18 && hour <= 21) {
			return EPeriodOfTheDay.EVEN;
		}
		else if (hour > 21 && hour <= 23) {
			return EPeriodOfTheDay.NIGHT;
		}
		else return EPeriodOfTheDay.MIDNG;
	}
	
	default Month getMonth(LocalDateTime time) {
		Month month = time.getMonth();
		return month;		
	}
	
	default Short getYear(LocalDateTime time) {
		Short year = (short) time.getYear();
		return year;
	}
	
	default void setValueToDto(LocalDateTime time) {
		
	}
}