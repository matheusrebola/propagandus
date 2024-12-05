package propagandus.backupservice.core.dtos;

import propagandus.backupservice.core.models.enumerators.EPackageType;

public record PackageTypeCreateDto(
  EPackageType packageType
) {

}
