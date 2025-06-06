package propagandus.persistenceservice.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.models.Reconhecimento;
import propagandus.persistenceservice.core.repositories.LocalRepository;
import propagandus.persistenceservice.core.repositories.ReconhecimentoRepository;

@Service
@RequiredArgsConstructor
public class PersistenciaService {
    private final ReconhecimentoRepository reconhecimentoRepository;
    private final LocalRepository localRepository;

    public Reconhecimento salvar(Reconhecimento reconhecimento){
        return reconhecimentoRepository.save(reconhecimento);
    }

    public Local salvar(Local local){
        return localRepository.save(local);
    }
}
