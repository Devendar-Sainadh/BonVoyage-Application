package com.Bonvoyage.UsersWishList.Repository;

import com.Bonvoyage.UsersWishList.Entity.UsersWishList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersWishListRepository extends JpaRepository<UsersWishList,String> {
    Optional<List<UsersWishList>> findByUserid(String userid);
}
