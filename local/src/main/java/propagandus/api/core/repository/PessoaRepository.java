package propagandus.api.core.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.enums.EIdade;
import propagandus.api.core.model.enums.EPessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{
  List<Pessoa> FindByTipoPessoa(EPessoa tipoPessoa);
  List<Pessoa> FindByTipoIdade(EIdade tipoIdade);

}
