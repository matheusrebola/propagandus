package propagandus.staticregisterservice.core.dtos;

import propagandus.staticregisterservice.core.models.enumerators.EPackageType;

public record PackageTypeCreateDto(
  EPackageType packageType
) {

}
