package com.Bonvoyage.PackageIternary.Repository;

import com.Bonvoyage.PackageIternary.Entity.PackageIternary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PackageIternaryRepository extends JpaRepository<PackageIternary,String> {


    Optional<List<PackageIternary>> findByPackageid(String packageID);
}
