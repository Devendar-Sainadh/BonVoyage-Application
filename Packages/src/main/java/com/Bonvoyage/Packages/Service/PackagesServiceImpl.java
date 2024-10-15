package com.Bonvoyage.Packages.Service;

import com.Bonvoyage.Packages.Dto.PackageIternaryDto;
import com.Bonvoyage.Packages.Dto.PackagesDto;
import com.Bonvoyage.Packages.Entity.Packages;
import com.Bonvoyage.Packages.Exception.ResourceNotFoundException;
import com.Bonvoyage.Packages.Feign.PackageIternaryClient;
import com.Bonvoyage.Packages.Repository.PackagesRepository;
import com.Bonvoyage.Packages.Utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class PackagesServiceImpl implements PackagesService {
    @Autowired
    private PackagesRepository packagesRepository;

    @Autowired
    private PackageIternaryClient packageIternaryClient;


    @Override
    public List<PackagesDto> getAllPackages() {
        List<Packages> packagesList=packagesRepository.findAll();
        List<PackagesDto> packagesDtoList=packagesList.stream().map(Mapper::mapToPackagesDto).toList();
        for(PackagesDto packagesDto: packagesDtoList){
            List<PackageIternaryDto> packageIternaryDtoList=packageIternaryClient.getAllPackageIternaryList(packagesDto.getPackageid());
            packagesDto.setPackageIternaryDtoList(packageIternaryDtoList);
        }
        return packagesDtoList;
    }

    @Override
    public PackagesDto getPackageByLocation(String location) {
        Packages packages=packagesRepository.findByPackagecity(location).orElseThrow(()-> new ResourceNotFoundException("package","location",location));
        PackagesDto packagesDto=Mapper.mapToPackagesDto(packages);
        List<PackageIternaryDto> packageIternaryDtoList=packageIternaryClient.getAllPackageIternaryList(packagesDto.getPackageid());
        packagesDto.setPackageIternaryDtoList(packageIternaryDtoList);
        return packagesDto;
    }

    @Override
    public PackagesDto getPackageByPackageID(String packageid) {
       Optional<Packages> packages=packagesRepository.findById(packageid);
       PackagesDto packagesDto=Mapper.mapToPackagesDto(packages.get());
       List<PackageIternaryDto> packageIternaryDtoList=packageIternaryClient.getAllPackageIternaryList(packagesDto.getPackageid());
       packagesDto.setPackageIternaryDtoList(packageIternaryDtoList);
       return packagesDto;
    }

    @Override
    public PackagesDto addPackages(PackagesDto packagesDto) {
        Packages packages_given=Mapper.mapToPackages(packagesDto);
        Packages packages_created=packagesRepository.save(packages_given);

        List<PackageIternaryDto> packageIternaryDtoList=packageIternaryClient.getAllPackageIternaryList(packagesDto.getPackageid());
        packagesDto.setPackageIternaryDtoList(packageIternaryDtoList);
        return packagesDto;
    }
}
