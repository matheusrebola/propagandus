package propagandus.datalake.core.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import propagandus.datalake.core.dtos.PeriodRegisterCreateDto;
import propagandus.datalake.core.models.enumerators.EPeriodOfTheDay;
import propagandus.datalake.core.services.periodreaction.PeriodRegisterDtoFactory;

import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;

public class PeriodRegisterDtoFactoryTest {
	private final PeriodRegisterDtoFactory dtoFactory = new PeriodRegisterDtoFactory();

    @Test
    void testCreateFromDateTime() {
        // Preparando o dado de entrada
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);

        // Executando o método
        PeriodRegisterCreateDto createDto = dtoFactory.createFromDateTime(dateTime);

        // Verificando os resultados esperados
        assertEquals((byte) 8, createDto.getDay());
        assertEquals(DayOfWeek.WEDNESDAY, createDto.getDayWeek());
        assertEquals((byte) 10, createDto.getHour());
        assertEquals((byte) 30, createDto.getMinute());
        assertEquals(EPeriodOfTheDay.MORN, createDto.getPeriodOfTheDay());
        assertEquals(Month.JANUARY, createDto.getMonth());
        assertEquals((short) 2025, createDto.getYear());
    }
}
