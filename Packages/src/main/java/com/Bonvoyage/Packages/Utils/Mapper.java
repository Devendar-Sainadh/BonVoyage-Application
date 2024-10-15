package com.Bonvoyage.Packages.Utils;

import com.Bonvoyage.Packages.Dto.PackagesDto;
import com.Bonvoyage.Packages.Entity.Packages;
import com.Bonvoyage.Packages.PackagesApplication;

public class Mapper {
    public static PackagesDto mapToPackagesDto(Packages packages){
        return PackagesApplication.modelMapper().map(packages,PackagesDto.class);
    }

    public static Packages mapToPackages(PackagesDto packagesDto){
        return PackagesApplication.modelMapper().map(packagesDto, Packages.class);
    }
}
