package propagandus.persistenceservice.core.services;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import propagandus.persistenceservice.core.cache.LocalCache;
import propagandus.persistenceservice.core.mappers.LocalMapper;
import propagandus.persistenceservice.core.models.Local;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocalCacheService {

    private final RedisTemplate<String, LocalCache> redisTemplate;
    private final LocalMapper mapper;
    private ValueOperations<String, LocalCache> valueOps;

    @PostConstruct
    private void init() {
        this.valueOps = redisTemplate.opsForValue();
    }

    public void cacheLocal(Local local) {
        valueOps.set(local.getId(), mapper.map(local));
    }

    public Optional<LocalCache> getCachedLocal(String id) {
        return Optional.ofNullable(valueOps.get(id));
    }

    public void evictLocal(String id) {
        redisTemplate.delete(id);
    }
}

