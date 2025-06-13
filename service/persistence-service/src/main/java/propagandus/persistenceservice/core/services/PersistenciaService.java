package propagandus.persistenceservice.core.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.cache.LocalCache;
import propagandus.persistenceservice.core.dtos.AccessTokenDTO;
import propagandus.persistenceservice.core.dtos.TokenDTO;
import propagandus.persistenceservice.core.mappers.LocalMapper;
import propagandus.persistenceservice.core.models.AccessToken;
import propagandus.persistenceservice.core.models.Local;
import propagandus.persistenceservice.core.models.Reconhecimento;
import propagandus.persistenceservice.core.repositories.AccessTokenRepository;
import propagandus.persistenceservice.core.repositories.LocalRepository;
import propagandus.persistenceservice.core.repositories.ReconhecimentoRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersistenciaService {
    private final ReconhecimentoRepository reconhecimentoRepository;
    private final LocalRepository localRepository;
    private final LocalCacheService localCacheService;
    private final LocalMapper localMapper;
    private final AuthService authService;
    private final AccessTokenRepository accessTokenRepository;

    public void salvar(Reconhecimento reconhecimento){
        reconhecimentoRepository.save(reconhecimento);
    }
    
    public void salvar(AccessToken accessToken){
        accessTokenRepository.save(accessToken);
    }

    public AccessTokenDTO salvar(Local local){
        Local saved = localRepository.save(local);
        localCacheService.cacheLocal(saved);
        TokenDTO token = authService.createToken();
        AccessTokenDTO accessToken = localMapper.map(token.getAccessToken(), saved.getId());
        salvar(localMapper.map(accessToken));
        return accessToken;
    }

    public Optional<Local> findById(String id) {
        Optional<LocalCache> cached = localCacheService.getCachedLocal(id);
        if (cached.isPresent()) {
            LocalCache dto = cached.get();
            return Optional.of(localMapper.map(dto));
        }
        Optional<Local> dbLocal = localRepository.findById(id);
        dbLocal.ifPresent(localCacheService::cacheLocal);
        return dbLocal;
    }

    public Optional<Local> encontrarLocal(String id) {
        return findById(id);
    }

}
