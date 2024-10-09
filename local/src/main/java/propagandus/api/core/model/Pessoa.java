package propagandus.api.core.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import propagandus.api.core.model.enums.EIdade;
import propagandus.api.core.model.enums.EPessoa;

@Entity
public record Pessoa(
  @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
  @Enumerated(EnumType.STRING) EPessoa tipoPessoa,
  @Enumerated(EnumType.STRING) EIdade tipoIdade,
  @OneToMany(mappedBy = "pessoa") List<Reacao> reacoes
) {  
}
