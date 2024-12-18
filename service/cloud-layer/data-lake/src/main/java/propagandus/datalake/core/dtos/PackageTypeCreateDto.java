package propagandus.datalake.core.dtos;

import propagandus.datalake.core.models.enumerators.EPackageType;

public record PackageTypeCreateDto(
  EPackageType packageType
) {

}
