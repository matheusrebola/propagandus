package propagandus.datalake.core.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.datalake.core.models.PackageType;
import propagandus.datalake.core.repositorys.PackageTypeRepository;

@Service
@RequiredArgsConstructor
public class PackageTypeService {
  private final PackageTypeRepository packageTypeRepository;
  public PackageType save(PackageType packageType){return packageTypeRepository.save(packageType);}
}
