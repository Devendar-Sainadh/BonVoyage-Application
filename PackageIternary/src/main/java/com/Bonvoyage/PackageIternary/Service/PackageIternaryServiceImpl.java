package com.Bonvoyage.PackageIternary.Service;

import com.Bonvoyage.PackageIternary.Dto.PackageIternaryDto;
import com.Bonvoyage.PackageIternary.Entity.PackageIternary;
import com.Bonvoyage.PackageIternary.Exception.ResourceNotFoundException;
import com.Bonvoyage.PackageIternary.Repository.PackageIternaryRepository;
import com.Bonvoyage.PackageIternary.Utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageIternaryServiceImpl implements PackageIternaryService{
    @Autowired
    private PackageIternaryRepository packageIternaryRepository;

    @Override
    public List<PackageIternaryDto> getAllPackageIternaryList(String packageid) {
        List<PackageIternary> packageIternaryList=packageIternaryRepository.findByPackageid(packageid).orElseThrow(()-> new ResourceNotFoundException("packageIternary","packageid",packageid));
        return packageIternaryList.stream().map(Mapper::mapToPackageIternaryDto).toList();
    }

    @Override
    public void addPackageIternary(PackageIternaryDto packageIternaryDto) {
        PackageIternary packageIternary=Mapper.mapToPackageIternary(packageIternaryDto);
        packageIternaryRepository.save(packageIternary);
    }
}
