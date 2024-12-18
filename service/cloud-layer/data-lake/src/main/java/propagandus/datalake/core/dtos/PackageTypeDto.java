package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  Long packageTypeId,
  EPackageType packageType
) {

}
