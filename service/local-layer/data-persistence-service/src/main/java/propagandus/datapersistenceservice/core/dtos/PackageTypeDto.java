package propagandus.datapersistenceservice.core.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EPackageType;

public record PackageTypeDto(
  @NotNull UUID packageTypeId,
  @NotNull EPackageType packageType
) {

}
