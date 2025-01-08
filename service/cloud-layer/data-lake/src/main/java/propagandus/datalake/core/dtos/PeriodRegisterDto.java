package propagandus.datalake.core.dtos;

import java.time.DayOfWeek;
import java.time.Month;

import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;

public class PeriodRegisterDto {
	private Long periodRegisterId;
	private Byte day;
	private DayOfWeek dayWeek;
	private Byte hour;
	private Byte minute;
	private EPeriodOfTheDay periodOfTheDay;
	private Month month;
	private Short year;
	
	public PeriodRegisterDto(Long periodRegisterId, Byte day, DayOfWeek dayWeek, Byte hour, Byte minute,
			EPeriodOfTheDay periodOfTheDay, Month month, Short year) {
		super();
		this.periodRegisterId = periodRegisterId;
		this.day = day;
		this.dayWeek = dayWeek;
		this.hour = hour;
		this.minute = minute;
		this.periodOfTheDay = periodOfTheDay;
		this.month = month;
		this.year = year;
	}
	
	
	public Long getPeriodRegisterId() {
		return periodRegisterId;
	}
	public void setPeriodRegisterId(Long periodRegisterId) {
		this.periodRegisterId = periodRegisterId;
	}
	public Byte getDay() {
		return day;
	}
	public void setDay(Byte day) {
		this.day = day;
	}
	public DayOfWeek getDayWeek() {
		return dayWeek;
	}
	public void setDayWeek(DayOfWeek dayWeek) {
		this.dayWeek = dayWeek;
	}
	public Byte getHour() {
		return hour;
	}
	public void setHour(Byte hour) {
		this.hour = hour;
	}
	public Byte getMinute() {
		return minute;
	}
	public void setMinute(Byte minute) {
		this.minute = minute;
	}
	public EPeriodOfTheDay getPeriodOfTheDay() {
		return periodOfTheDay;
	}
	public void setPeriodOfTheDay(EPeriodOfTheDay periodOfTheDay) {
		this.periodOfTheDay = periodOfTheDay;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public Short getYear() {
		return year;
	}
	public void setYear(Short year) {
		this.year = year;
	}
}
