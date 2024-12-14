package propagandus.datapersistenceservice.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datapersistenceservice.core.models.PackageType;
import propagandus.datapersistenceservice.core.repositorys.PackageTypeRepository;

@Service
@RequiredArgsConstructor
public class PackageTypeService {
  private final PackageTypeRepository packageTypeRepository;
  public PackageType save(PackageType packageType){return packageTypeRepository.save(packageType);}
}
