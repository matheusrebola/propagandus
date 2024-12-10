package propagandus.datalake.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datalake.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  @NotNull Long packageTypeId,
  @NotNull EPackageType packageType
) {

}
