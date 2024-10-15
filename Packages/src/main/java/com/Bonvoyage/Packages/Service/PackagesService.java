package com.Bonvoyage.Packages.Service;

import com.Bonvoyage.Packages.Dto.PackagesDto;

import java.util.List;

public interface PackagesService {

         // 1)
         List<PackagesDto> getAllPackages();
         // 2)
         PackagesDto getPackageByLocation(String Location);
         // 3)
         PackagesDto getPackageByPackageID(String packageid);

         PackagesDto addPackages(PackagesDto packagesDto);
}
