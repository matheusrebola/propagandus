package propagandus.datalake.core.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;
import propagandus.datalake.core.services.periodreaction.DateTimeProcessor;

import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;

public class DateTimeProcessorTest {
    static class TestDateTimeProcessor implements DateTimeProcessor {}

    private final DateTimeProcessor processor = new TestDateTimeProcessor();

    @Test
    void testGetDay() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        Byte expectedDay = 8;
        assertEquals(expectedDay, processor.getDay(dateTime));
    }

    @Test
    void testGetDayOfWeek() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;
        assertEquals(expectedDayOfWeek, processor.getDayOfWeek(dateTime));
    }

    @Test
    void testGetHour() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        Byte expectedHour = 10;
        assertEquals(expectedHour, processor.getHour(dateTime));
    }

    @Test
    void testGetMinute() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        Byte expectedMinute = 30;
        assertEquals(expectedMinute, processor.getMinute(dateTime));
    }

    @Test
    void testGetPeriodOfDay() {
        LocalDateTime morningTime = LocalDateTime.of(2025, 1, 8, 8, 30);
        assertEquals(EPeriodOfTheDay.MORN, processor.getPeriodOfDay(morningTime));

        LocalDateTime afternoonTime = LocalDateTime.of(2025, 1, 8, 15, 30);
        assertEquals(EPeriodOfTheDay.AFTER, processor.getPeriodOfDay(afternoonTime));

        LocalDateTime eveningTime = LocalDateTime.of(2025, 1, 8, 19, 0);
        assertEquals(EPeriodOfTheDay.EVEN, processor.getPeriodOfDay(eveningTime));

        LocalDateTime nightTime = LocalDateTime.of(2025, 1, 8, 22, 30);
        assertEquals(EPeriodOfTheDay.NIGHT, processor.getPeriodOfDay(nightTime));

        LocalDateTime midnightTime = LocalDateTime.of(2025, 1, 8, 3, 30);
        assertEquals(EPeriodOfTheDay.MIDNG, processor.getPeriodOfDay(midnightTime));
    }

    @Test
    void testGetMonth() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        Month expectedMonth = Month.JANUARY;
        assertEquals(expectedMonth, processor.getMonth(dateTime));
    }

    @Test
    void testGetYear() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);
        Short expectedYear = 2025;
        assertEquals(expectedYear, processor.getYear(dateTime));
    }
}
