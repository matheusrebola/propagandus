package propagandus.api.core.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.model.Horario;
import propagandus.api.core.model.enums.EHorario;
import propagandus.api.core.repository.HorarioRepository;

@Service
@RequiredArgsConstructor
public class HorarioService {
  private final HorarioRepository horarioRepository;

  public List<Horario> getAll(){
    return horarioRepository.findAll();
  }

  public boolean exists(UUID id){
    return horarioRepository.existsById(id);
  }

  public Horario findById(UUID id){
    return horarioRepository.findById(id).orElse(null);
  }

  public Horario save(Horario horario){
    return horarioRepository.save(horario);
  }

  public List<Horario> findHorarios(EHorario horario){
    return horarioRepository.FindByHorario(horario);
  }

}
