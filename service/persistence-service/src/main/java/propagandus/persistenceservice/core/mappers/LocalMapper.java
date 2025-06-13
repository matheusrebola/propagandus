package propagandus.persistenceservice.core.mappers;

import org.springframework.stereotype.Component;
import propagandus.persistenceservice.core.cache.LocalCache;
import propagandus.persistenceservice.core.dtos.AccessTokenDTO;
import propagandus.persistenceservice.core.dtos.LocalDTO;
import propagandus.persistenceservice.core.models.AccessToken;
import propagandus.persistenceservice.core.models.Local;

@Component
public class LocalMapper {

    public Local map(LocalDTO dto){
        return Local.builder()
                .zona(dto.getZona())
                .local(dto.getLocal())
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .detalhes(dto.getDetalhes())
                .build();
    }

    public LocalCache map(Local local){
        return LocalCache.builder()
                .id(local.getId())
                .zona(local.getZona())
                .local(local.getLocal())
                .latitude(local.getLatitude())
                .longitude(local.getLongitude())
                .detalhes(local.getDetalhes())
                .build();
    }

    public Local map(LocalCache local){
        return Local.builder()
                .id(local.getId())
                .zona(local.getZona())
                .local(local.getLocal())
                .latitude(local.getLatitude())
                .longitude(local.getLongitude())
                .detalhes(local.getDetalhes())
                .build();
    }

    public AccessTokenDTO map(String token, String id) {
        return AccessTokenDTO.builder()
                .localId(id)
                .tokenJwt(token)
                .build();
    }
    
    public AccessToken map(AccessTokenDTO dto){
        return AccessToken.builder()
                .tokenJwt(dto.tokenJwt())
                .localId(dto.localId())
                .build();
    }
}
