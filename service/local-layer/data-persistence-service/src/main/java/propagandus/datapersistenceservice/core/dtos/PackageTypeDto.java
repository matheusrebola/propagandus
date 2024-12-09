package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  @NotNull Long packageTypeId,
  @NotNull EPackageType packageType
) {

}
