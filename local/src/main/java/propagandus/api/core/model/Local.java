package propagandus.api.core.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public record Local(
   @Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
   String cep,
   String logradouro,
   String numero, String cidade,
   String estado,
   @OneToMany(mappedBy = "local") List<Reacao> reacoes,
   @OneToMany(mappedBy = "local") List<Painel> paineis
) {
} 

