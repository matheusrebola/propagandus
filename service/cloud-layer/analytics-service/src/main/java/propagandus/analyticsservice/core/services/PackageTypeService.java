package propagandus.analyticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analyticsservice.core.models.PackageType;
import propagandus.analyticsservice.core.repositorys.PackageTypeRepository;

@Service
@RequiredArgsConstructor
public class PackageTypeService {
  private final PackageTypeRepository packageTypeRepository;

  public List<PackageType> findAll(){return packageTypeRepository.findAll();}
  public PackageType findById(Long id){return packageTypeRepository.findById(id).orElse(null);}
  public PackageType save(PackageType packageType){return packageTypeRepository.save(packageType);}
  public boolean existsById(Long id){return packageTypeRepository.existsById(id);}
}
