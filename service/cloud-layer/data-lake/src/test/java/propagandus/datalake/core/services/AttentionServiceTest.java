package propagandus.datalake.core.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import propagandus.datalake.core.documents.AttentionDocument;
import propagandus.datalake.core.dtos.AttentionCreateDto;
import propagandus.datalake.core.mappers.AttentionMapper;
import propagandus.datalake.core.models.Attention;
import propagandus.datalake.core.models.PeriodRegister;
import propagandus.datalake.core.repositorys.AttentionRepository;
import propagandus.datalake.core.services.attention.AttentionDtoFactory;
import propagandus.datalake.core.services.attention.AttentionService;
import propagandus.datalake.core.services.periodreaction.PeriodRegisterService;

@ExtendWith(MockitoExtension.class)
public class AttentionServiceTest {
	@Mock
    private PeriodRegisterService periodRegisterService;

    @Mock
    private AttentionMapper attentionMapper;

    @Mock
    private AttentionRepository attentionRepository;

    @Mock
    private AttentionDtoFactory attentionCreateDtoFactory;

    @InjectMocks
    private AttentionService attentionService;

    @Test
    void shouldSaveAttentionSuccessfully() {
        // Arrange
        AttentionDocument attentionDocument = mock(AttentionDocument.class);
        PeriodRegister periodRegister = mock(PeriodRegister.class);
        AttentionCreateDto createDto = mock(AttentionCreateDto.class);
        Attention mappedAttention = mock(Attention.class);
        Attention savedAttention = mock(Attention.class);

        when(attentionDocument.attentionTime()).thenReturn(LocalDateTime.now());
        when(periodRegisterService.save(any(LocalDateTime.class))).thenReturn(periodRegister);
        when(periodRegister.id()).thenReturn(1L);
        when(attentionCreateDtoFactory.createFrom(attentionDocument, 1L)).thenReturn(createDto);
        when(attentionMapper.map(createDto)).thenReturn(mappedAttention);
        when(attentionRepository.save(mappedAttention)).thenReturn(savedAttention);

        // Act
        Attention result = attentionService.save(attentionDocument);

        // Assert
        verify(periodRegisterService).save(any(LocalDateTime.class));
        verify(attentionCreateDtoFactory).createFrom(attentionDocument, 1L);
        verify(attentionMapper).map(createDto);
        verify(attentionRepository).save(mappedAttention);
        assertEquals(savedAttention, result);
    }
}
