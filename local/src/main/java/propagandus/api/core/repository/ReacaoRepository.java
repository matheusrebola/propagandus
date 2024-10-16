package propagandus.api.core.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import propagandus.api.core.model.Horario;
import propagandus.api.core.model.Pessoa;
import propagandus.api.core.model.Reacao;
import propagandus.api.core.model.enums.EAtencao;
import propagandus.api.core.model.enums.EReacao;

@Repository
public interface ReacaoRepository extends JpaRepository<Reacao, UUID> {
  List<Reacao> findByTipoReacao(EReacao tipoReacao);
  List<Reacao> findByPessoa(Pessoa pessoa);
  List<Reacao> findByHorario(Horario horario);
  List<Reacao> findByNivelAtencao(EAtencao nivelAtencao);
  List<Reacao> findByDataReacao(LocalDateTime dataReacao);
}