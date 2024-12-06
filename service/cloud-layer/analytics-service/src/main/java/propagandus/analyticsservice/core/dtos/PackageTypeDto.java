package propagandus.analyticsservice.core.dtos;

import propagandus.analyticsservice.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  Long packageTypeId,
  EPackageType packageType
) {

}
