package com.Bonvoyage.PackageIternary.Service;

import com.Bonvoyage.PackageIternary.Dto.PackageIternaryDto;
import com.Bonvoyage.PackageIternary.Entity.PackageIternary;

import java.util.List;

public interface PackageIternaryService {

    List<PackageIternaryDto> getAllPackageIternaryList(String packageid);

    void addPackageIternary(PackageIternaryDto packageIternaryDto);
}
