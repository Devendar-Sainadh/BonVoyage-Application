package com.Bonvoyage.UsersWishList.Utils;

import com.Bonvoyage.UsersWishList.Dto.UsersWishListDto;
import com.Bonvoyage.UsersWishList.Entity.UsersWishList;
import com.Bonvoyage.UsersWishList.UsersWishListApplication;

public class Mapper {

    public static UsersWishListDto mapToUsersWishListDto(UsersWishList usersWishList){
        return UsersWishListApplication.modelMapper().map(usersWishList,UsersWishListDto.class);
    }

    public static UsersWishList mapToUsersWishList(UsersWishListDto usersWishListDto){
        return UsersWishListApplication.modelMapper().map(usersWishListDto, UsersWishList.class);
    }
}
