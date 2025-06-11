package propagandus.persistenceservice.core.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.cache.LocalCache;
import propagandus.persistenceservice.core.mappers.LocalMapper;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.models.Reconhecimento;
import propagandus.persistenceservice.core.repositories.LocalRepository;
import propagandus.persistenceservice.core.repositories.ReconhecimentoRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersistenciaService {
    private final ReconhecimentoRepository reconhecimentoRepository;
    private final LocalRepository localRepository;
    private final LocalCacheService localCacheService;
    private final LocalMapper mapper;

    public Reconhecimento salvar(Reconhecimento reconhecimento){
        return reconhecimentoRepository.save(reconhecimento);
    }

    public Local salvar(Local local){
        Local saved = localRepository.save(local);
        localCacheService.cacheLocal(saved);
        return saved;
    }

    public Optional<Local> findById(String id) {
        Optional<LocalCache> cached = localCacheService.getCachedLocal(id);
        if (cached.isPresent()) {
            LocalCache dto = cached.get();
            return Optional.of(mapper.map(dto));
        }
        Optional<Local> dbLocal = localRepository.findById(id);
        dbLocal.ifPresent(localCacheService::cacheLocal);
        return dbLocal;
    }

    public Optional<Local> encontrarLocal(String id) {
        return findById(id);
    }

}
