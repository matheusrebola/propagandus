package propagandus.api.core.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.model.Horario;
import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.Reacao;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;
import propagandus.api.core.repository.ReacaoRepository;

@Service
@RequiredArgsConstructor
public class ReacaoService {
  private final ReacaoRepository reacaoRepository;

  public Reacao findById(UUID id){
    return reacaoRepository.findById(id).orElse(null);
  }

  public List<Reacao> getAll(){
    return reacaoRepository.findAll();
  }

  public boolean exists(UUID id){
    return reacaoRepository.existsById(id);
  }

  public Reacao save(Reacao reacao){
    return reacaoRepository.save(reacao);
  }

  public List<Reacao> findByTipoPessoa(Pessoa pessoa){
    return reacaoRepository.findByPessoa(pessoa);
  }

  public List<Reacao> findByTipoReacao(EReacao tipReacao){
    return reacaoRepository.findByTipoReacao(tipReacao);
  }

  public List<Reacao> findByHorario(Horario horario){
    return reacaoRepository.findByHorario(horario);
  }

  public List<Reacao> FindByNivelAtencao(EAtencao atencao){
    return reacaoRepository.findByNivelAtencao(atencao);
  }

  public List<Reacao> findByDataReacao(LocalDateTime dataHora){
    return reacaoRepository.findByDataReacao(dataHora);
  }

}
