package propagandus.staticregisterservice.core.dtos;

import propagandus.staticregisterservice.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  Long packageTypeId,
  EPackageType packageType
) {

}
