package propagandus.analiticsservice.core.dtos;

import propagandus.analiticsservice.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  Long packageTypeId,
  EPackageType packageType
) {

}
