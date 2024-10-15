package com.Bonvoyage.Packages.Controller;

import com.Bonvoyage.Packages.Dto.PackagesDto;
import com.Bonvoyage.Packages.Service.PackagesService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/packages")
public class PackagesController {
    @Autowired
    private PackagesService packagesService;

    // To get All Packages
    @GetMapping("/getPackages")
    public ResponseEntity<List<PackagesDto>> getAllPackages(){
        List<PackagesDto> packagesDtoList=packagesService.getAllPackages();
        return ResponseEntity.status(HttpStatus.FOUND).body(packagesDtoList);
    }

    // To get Package using location
    @GetMapping("/packages/{location}")
    public ResponseEntity<PackagesDto> getPackagebyLocation(@PathVariable String location){
        PackagesDto packagesDto=packagesService.getPackageByLocation(location);
        return ResponseEntity.status(HttpStatus.FOUND).body(packagesDto);
    }

    // To get package using packageid
    @GetMapping("/onepackage/{packageid}")
    public ResponseEntity<PackagesDto> getPackagebyPackageId(@PathVariable String packageid){
        PackagesDto packagesDto=packagesService.getPackageByPackageID(packageid);
        return ResponseEntity.status(HttpStatus.FOUND).body(packagesDto);
    }

    // To add Packages
    @PostMapping("/addpackages")
    public ResponseEntity<PackagesDto> addPackages(@Valid @RequestBody PackagesDto packagesDto){
        return ResponseEntity.status(HttpStatus.OK).body(packagesService.addPackages(packagesDto));
    }
}
