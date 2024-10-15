package com.Bonvoyage.Users.Feign;


import com.Bonvoyage.Users.Dto.UsersWishListDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "userswishlist")
public interface UsersWishListClient {

    @GetMapping("/userswishlist/getwishlist/{userid}")
    List<UsersWishListDto> getAllUserwishlists(@PathVariable String userid);

    @PutMapping("/userswishlist/{userid}/{wishlistid}")
    void updateUserwishlist(@PathVariable String userid,@PathVariable String wishlistid);
}
