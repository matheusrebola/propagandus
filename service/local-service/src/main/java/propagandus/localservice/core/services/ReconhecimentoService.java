
package propagandus.localservice.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.localservice.core.documents.Reconhecimento;
import propagandus.localservice.core.producers.SagaProducer;
import propagandus.localservice.core.repositories.ReconhecimentoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReconhecimentoService {
    private final ReconhecimentoRepository repository;
    private final SagaProducer producer;

    public void registrarNaFila(Reconhecimento r) {
        producer.enviarEvento(r.toString(),"topico");
    }

    public Reconhecimento salvar(Reconhecimento reconhecimento) {
        return repository.save(reconhecimento);
    }

    public void deletarPeloId(String id){
        repository.deleteById(id);
    }

    public List<Reconhecimento> verificarBanco() {
        return repository.findAll();
    }

    public Reconhecimento registrarNaFila(List<Reconhecimento> listRecon) {
        return listRecon.stream().forEach(reconhecimento -> registrarNaFila(reconhecimento));
    }

    public void deletarPeloId(List<Reconhecimento> listRecon) {
        listRecon.stream().forEach(recon -> deletarPeloId(recon.getId()));
    }
}
