package propagandus.analyticsservice.core.dtos;

import jakarta.validation.constraints.NotNull;
import propagandus.analyticsservice.core.models.enumerators.EPackageType;

public record PackageTypeCreateDto(
  @NotNull EPackageType packageType
) {

}
