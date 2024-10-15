package com.Bonvoyage.PackageIternary.Controller;

import com.Bonvoyage.PackageIternary.Dto.PackageIternaryDto;
import com.Bonvoyage.PackageIternary.Service.PackageIternaryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/packageiternary")
public class PackageIternaryController {
    @Autowired
    private PackageIternaryService packageIternaryService;

    // Get All PackageIternary List
    @GetMapping("/packageiternarylist/{packageid}")
    public ResponseEntity<List<PackageIternaryDto>> getAllPackageIternaryList(@PathVariable String packageid){
        List<PackageIternaryDto> packageIternaryDtoList=packageIternaryService.getAllPackageIternaryList(packageid);
        return ResponseEntity.status(HttpStatus.OK).body(packageIternaryDtoList);
    }

    // Add Package Iternary List
    @PostMapping("/addpackageiternarylist")
    public ResponseEntity<String> addpackageIternary(@Valid @RequestBody PackageIternaryDto packageIternaryDto){
        packageIternaryService.addPackageIternary(packageIternaryDto);
        return ResponseEntity.status(HttpStatus.OK).body("Package Iternary Added Successfully!!!!");
    }
}
