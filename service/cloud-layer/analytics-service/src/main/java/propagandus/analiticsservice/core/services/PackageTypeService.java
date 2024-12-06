package propagandus.analiticsservice.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import propagandus.analiticsservice.core.models.PackageType;
import propagandus.analiticsservice.core.models.enumerators.EPackageType;
import propagandus.analiticsservice.core.repositorys.PackageTypeRepository;

@Service
@RequiredArgsConstructor
public class PackageTypeService {
  private final PackageTypeRepository packageTypeRepository;

  public List<PackageType> findAll(){return packageTypeRepository.findAll();}
  public PackageType findById(Long id){return packageTypeRepository.findById(id).orElse(null);}
  public PackageType save(PackageType packageType){return packageTypeRepository.save(packageType);}
  public List<EPackageType> findByPackageType(EPackageType packageType){return packageTypeRepository.findByPackageType(packageType);}
}