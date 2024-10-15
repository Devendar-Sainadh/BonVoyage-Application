package com.Bonvoyage.Packages.Feign;

import com.Bonvoyage.Packages.Dto.PackageIternaryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "packageiternary")
public interface PackageIternaryClient {

    @GetMapping("/packageiternary/packageiternarylist/{packageid}")
     List<PackageIternaryDto> getAllPackageIternaryList(@PathVariable String packageid);
}
