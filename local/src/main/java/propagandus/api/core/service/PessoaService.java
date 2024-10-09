package propagandus.api.core.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.enums.EIdade;
import propagandus.api.core.model.enums.EPessoa;
import propagandus.api.core.repository.PessoaRepository;

@Service
@RequiredArgsConstructor
public class PessoaService {
  private final PessoaRepository pessoaRepository;

  public List<Pessoa> getAll(){
    return pessoaRepository.findAll();
  }

  public boolean exists(UUID id){
    return pessoaRepository.existsById(id);
  }

  public Pessoa findById(UUID id){
    return pessoaRepository.findById(id).orElse(null);
  }

  public Pessoa save(Pessoa pessoa){
    return pessoaRepository.save(pessoa);
  }

  public List<Pessoa> findByTipoPessoas(EPessoa tipoPessoa){
    return pessoaRepository.FindByTipoPessoa(tipoPessoa);
  }

  public List<Pessoa> findByTipoIdade(EIdade tipoIdade){
    return pessoaRepository.FindByTipoIdade(tipoIdade);
  }

}
