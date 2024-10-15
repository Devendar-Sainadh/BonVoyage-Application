package com.Bonvoyage.PackageIternary.Utils;

import com.Bonvoyage.PackageIternary.Dto.PackageIternaryDto;
import com.Bonvoyage.PackageIternary.Entity.PackageIternary;
import com.Bonvoyage.PackageIternary.PackageIternaryApplication;

public class Mapper {
    public static PackageIternaryDto mapToPackageIternaryDto(PackageIternary packageIternary){
        return PackageIternaryApplication.modelMapper().map(packageIternary, PackageIternaryDto.class);
    }

    public static PackageIternary mapToPackageIternary(PackageIternaryDto packageIternaryDto){
        return PackageIternaryApplication.modelMapper().map(packageIternaryDto, PackageIternary.class);
    }
}
