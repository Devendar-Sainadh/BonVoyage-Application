package com.Bonvoyage.Users.Controller;

import com.Bonvoyage.Users.Dto.BookingsDto;
import com.Bonvoyage.Users.Dto.UsersDto;
import com.Bonvoyage.Users.Service.UsersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    // To register an User
    @PostMapping("/register")
    public ResponseEntity<UsersDto> registerUser(@Valid @RequestBody UsersDto usersDto){
        UsersDto usersDto1=usersService.registerUser(usersDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(usersDto1);
    }

    // To login an User
    @GetMapping("/login")
    public ResponseEntity<UsersDto> login(@Valid @RequestParam String email,@Valid @RequestParam String password){
        return ResponseEntity.status(HttpStatus.OK).body(usersService.login(email,password));
    }

    // To get User using Username
    @GetMapping("/username/{username}")
    public ResponseEntity<UsersDto> getUserbyUserName(@PathVariable String username){
        return ResponseEntity.status(HttpStatus.FOUND).body(usersService.getUserbyUsername(username));
    }

    // To get User using userid
    @GetMapping("/userid/{userid}")
    public ResponseEntity<UsersDto> getUserbyId(@PathVariable String userid){
        return ResponseEntity.status(HttpStatus.OK).body(usersService.getUserbyID(userid));
    }

    // To Update UserWishlist
    @PutMapping("/wishlist/{userid}/{wishlistid}")
    public ResponseEntity<UsersDto> updateUserWishList(@PathVariable String userid, @PathVariable String wishlistid){
        return ResponseEntity.status(HttpStatus.OK).body(usersService.updateUserWishlist(userid,wishlistid));
    }
}
