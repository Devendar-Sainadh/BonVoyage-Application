package com.Bonvoyage.UsersWishList.Service;

import com.Bonvoyage.UsersWishList.Dto.UsersDto;
import com.Bonvoyage.UsersWishList.Dto.UsersWishListDto;

import java.util.List;

public interface UsersWishListService {
    // 8)
    void updateUsersWishList(String userid, String wishlistid);

    List<UsersWishListDto> getAllUserWishlists(String userid);

    void addUserWishList(UsersWishListDto usersWishListDto);
}
