package propagandus.datalake.core.services;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import propagandus.datalake.core.dtos.PeriodRegisterCreateDto;
import propagandus.datalake.core.mappers.PeriodRegisterMapper;
import propagandus.datalake.core.models.PeriodRegister;
import propagandus.datalake.core.repositorys.PeriodRegisterRepository;
import propagandus.datalake.core.services.periodreaction.PeriodRegisterDtoFactory;
import propagandus.datalake.core.services.periodreaction.PeriodRegisterService;

import java.time.LocalDateTime;

public class PeriodRegisterServiceTest {
	private PeriodRegisterRepository periodRegisterRepository;
    private PeriodRegisterMapper registerMapper;
    private PeriodRegisterDtoFactory dtoFactory;
    private PeriodRegisterService service;
    private PeriodRegister expectedPeriodRegister;
   

    @BeforeEach
    void setUp() {
        // Criando mocks
        periodRegisterRepository = mock(PeriodRegisterRepository.class);
        registerMapper = mock(PeriodRegisterMapper.class);
        dtoFactory = mock(PeriodRegisterDtoFactory.class);

        // Injetando os mocks no service
        service = new PeriodRegisterService(periodRegisterRepository, registerMapper, dtoFactory);
    }

    @Test
    void testSave() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 8, 10, 30);

        PeriodRegisterCreateDto createDto = new PeriodRegisterCreateDto();

        when(dtoFactory.createFromDateTime(dateTime)).thenReturn(createDto);
        when(registerMapper.map(createDto)).thenReturn(expectedPeriodRegister);
        when(periodRegisterRepository.save(expectedPeriodRegister)).thenReturn(expectedPeriodRegister);

        PeriodRegister result = service.save(dateTime);

        assertEquals(expectedPeriodRegister, result);

        verify(dtoFactory).createFromDateTime(dateTime);
        verify(registerMapper).map(createDto);
        verify(periodRegisterRepository).save(expectedPeriodRegister);
    }
}
