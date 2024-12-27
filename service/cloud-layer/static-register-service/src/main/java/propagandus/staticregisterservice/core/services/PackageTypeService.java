package propagandus.staticregisterservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.staticregisterservice.core.models.PackageType;
import propagandus.staticregisterservice.core.repositorys.PackageTypeRepository;

@Service
@RequiredArgsConstructor
public class PackageTypeService {
  private final PackageTypeRepository packageTypeRepository;
  public PackageType save(PackageType packageType){return packageTypeRepository.save(packageType);}
}
