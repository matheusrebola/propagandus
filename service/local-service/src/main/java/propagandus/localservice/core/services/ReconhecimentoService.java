
package propagandus.localservice.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.dtos.ReconhecimentoCreateDTO;
import propagandus.localservice.core.producers.SagaProducer;
import propagandus.localservice.core.repositories.ReconhecimentoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReconhecimentoService {
    private final ReconhecimentoRepository repository;
    private final SagaProducer producer;

    public void registrarNaFila(ReconhecimentoCreateDTO reconhecimento) {
        producer.enviarReconhecimento(reconhecimento);
    }

    public void salvar(Reconhecimento reconhecimento) {
        repository.save(reconhecimento);
    }

    public void deletarPeloId(String id){
        repository.deleteById(id);
    }

    public List<Reconhecimento> encontrarTodos() {
        return repository.findAll();
    }

}
