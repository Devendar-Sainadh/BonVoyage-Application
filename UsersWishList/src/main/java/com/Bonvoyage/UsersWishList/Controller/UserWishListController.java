package com.Bonvoyage.UsersWishList.Controller;


import com.Bonvoyage.UsersWishList.Dto.UsersDto;
import com.Bonvoyage.UsersWishList.Dto.UsersWishListDto;
import com.Bonvoyage.UsersWishList.Service.UsersWishListService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated

@RequestMapping("/userswishlist")
public class UserWishListController {
    @Autowired
    private UsersWishListService usersWishListService;

    // To update UserWishlist
    @PutMapping("/{userid}/{wishlistid}")
    public ResponseEntity<Void> updateUserWishList(@PathVariable String userid, @PathVariable String wishlistid){
        usersWishListService.updateUsersWishList(userid,wishlistid);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    // To get All userWishlists
    @GetMapping("/getwishlist/{userid}")
    public ResponseEntity<List<UsersWishListDto>> getAllUserwishlists(@PathVariable String userid){
        return ResponseEntity.status(HttpStatus.OK).body(usersWishListService.getAllUserWishlists(userid));
    }

    // To add a Wishlist
    @PostMapping("/addwishlist")
    public ResponseEntity<String> addWishlist(@Valid @RequestBody UsersWishListDto usersWishListDto){
        usersWishListService.addUserWishList(usersWishListDto);
        return ResponseEntity.status(HttpStatus.OK).body("Added WishList Successfully!!!!");
    }
}
