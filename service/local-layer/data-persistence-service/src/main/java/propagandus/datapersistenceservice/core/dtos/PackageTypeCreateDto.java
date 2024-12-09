package propagandus.datapersistenceservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.datapersistenceservice.core.models.enumerators.EPackageType;

public record PackageTypeCreateDto(
  @NotNull EPackageType packageType
) {

}
