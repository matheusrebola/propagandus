package propagandus.datalake.core.services.periodreaction;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import propagandus.datalake.core.dtos.PeriodRegisterCreateDto;
import propagandus.datalake.core.mappers.PeriodRegisterMapper;
import propagandus.datalake.core.models.PeriodRegister;
import propagandus.datalake.core.repositorys.PeriodRegisterRepository;

@Service
public class PeriodRegisterService {

	private PeriodRegisterRepository periodRegisterRepository;
    private PeriodRegisterMapper registerMapper;
    private PeriodRegisterDtoFactory dtoFactory;
    
    public PeriodRegisterService(PeriodRegisterRepository periodRegisterRepository, PeriodRegisterMapper registerMapper,
			PeriodRegisterDtoFactory dtoFactory) {
		super();
		this.periodRegisterRepository = periodRegisterRepository;
		this.registerMapper = registerMapper;
		this.dtoFactory = dtoFactory;
	}

	public PeriodRegister save(LocalDateTime time) {
        PeriodRegisterCreateDto createDto = dtoFactory.createFromDateTime(time);
        PeriodRegister periodRegister = registerMapper.map(createDto);
        return periodRegisterRepository.save(periodRegister);
    }
}