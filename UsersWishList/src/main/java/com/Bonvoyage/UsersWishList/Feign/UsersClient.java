package com.Bonvoyage.UsersWishList.Feign;


import com.Bonvoyage.UsersWishList.Dto.UsersDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "users")
public interface UsersClient {
    @GetMapping("/users/userid/{userid}")
    UsersDto getUserbyId( @PathVariable String userid);
}
