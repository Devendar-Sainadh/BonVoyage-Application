package com.Bonvoyage.Bookings.Repository;

import com.Bonvoyage.Bookings.Entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Bookings,String> {
    Optional<List<Bookings>> findByUserid(String userID);
}
