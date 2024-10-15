package com.Bonvoyage.Users.Repository;

import com.Bonvoyage.Users.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,String> {
    Optional<Users> findByUseremailAndUserpassword(String email, String password);

    Optional<Users> findByUsername(String username);
}
