package com.Bonvoyage.Packages.Repository;

import com.Bonvoyage.Packages.Entity.Packages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PackagesRepository extends JpaRepository<Packages,String> {

    Optional<Packages> findByPackagecity(String location);
}
