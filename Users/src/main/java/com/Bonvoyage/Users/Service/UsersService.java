package com.Bonvoyage.Users.Service;

import com.Bonvoyage.Users.Dto.UsersDto;

public interface UsersService {
    // 4)
    UsersDto registerUser(UsersDto usersDto);
    // 5) Login
    UsersDto login(String email,String password);
    //6)
    UsersDto getUserbyUsername(String username);

    UsersDto getUserbyID(String userid);

    UsersDto updateUserWishlist(String userid, String wishlistid);
}
