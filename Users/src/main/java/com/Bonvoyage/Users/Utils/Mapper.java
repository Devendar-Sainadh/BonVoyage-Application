package com.Bonvoyage.Users.Utils;

import com.Bonvoyage.Users.Dto.UsersDto;
import com.Bonvoyage.Users.Entity.Users;
import com.Bonvoyage.Users.UsersApplication;

public class Mapper {

    public static UsersDto mapToUsersDto(Users users){
        return UsersApplication.modelMapper().map(users,UsersDto.class);
    }

    public static Users mapToUsers(UsersDto usersDto){
        return UsersApplication.modelMapper().map(usersDto, Users.class);
    }
}
