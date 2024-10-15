package com.Bonvoyage.Users.Service;

import com.Bonvoyage.Users.Dto.BookingsDto;
import com.Bonvoyage.Users.Dto.UsersDto;
import com.Bonvoyage.Users.Dto.UsersWishListDto;
import com.Bonvoyage.Users.Entity.Users;
import com.Bonvoyage.Users.Exception.ResourceNotFoundException;
import com.Bonvoyage.Users.Feign.BookingsClient;
import com.Bonvoyage.Users.Feign.UsersWishListClient;
import com.Bonvoyage.Users.Repository.UsersRepository;
import com.Bonvoyage.Users.Utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersWishListClient usersWishListClient;

    @Autowired
    private BookingsClient bookingsClient;

    @Override
    public UsersDto registerUser(UsersDto usersDto) {
        Users users_given=Mapper.mapToUsers(usersDto);
        Users users_saved=usersRepository.save(users_given);

        String userID=usersDto.getUserid();
        List<UsersWishListDto> usersWishListDtoList= usersWishListClient.getAllUserwishlists(userID);
        usersDto.setUsersWishListDtoList(usersWishListDtoList);
        List<BookingsDto> bookingsDtoList=bookingsClient.getAllBookingsbyUserID(userID);
        usersDto.setBookingsDtoList(bookingsDtoList);

        return usersDto;
    }

    @Override
    public UsersDto login(String email, String password) {
        Users users=usersRepository.findByUseremailAndUserpassword(email,password).orElseThrow(()-> new ResourceNotFoundException("user","email and password",email));
        UsersDto usersDto=Mapper.mapToUsersDto(users);
        String userID=usersDto.getUserid();
        List<UsersWishListDto> usersWishListDtoList= usersWishListClient.getAllUserwishlists(userID);
        usersDto.setUsersWishListDtoList(usersWishListDtoList);
        List<BookingsDto> bookingsDtoList=bookingsClient.getAllBookingsbyUserID(userID);
        usersDto.setBookingsDtoList(bookingsDtoList);
        return usersDto;
    }

    @Override
    public UsersDto getUserbyUsername(String username) {
        Users users=usersRepository.findByUsername(username).orElseThrow(()-> new ResourceNotFoundException("user","username",username));
        UsersDto usersDto=Mapper.mapToUsersDto(users);
        String userID=usersDto.getUserid();
        List<UsersWishListDto> usersWishListDtoList= usersWishListClient.getAllUserwishlists(userID);
        usersDto.setUsersWishListDtoList(usersWishListDtoList);
        List<BookingsDto> bookingsDtoList=bookingsClient.getAllBookingsbyUserID(userID);
        usersDto.setBookingsDtoList(bookingsDtoList);
        return usersDto;
    }

    @Override
    public UsersDto getUserbyID(String userid) {
        Users users=usersRepository.findById(userid).orElseThrow(()-> new ResourceNotFoundException("user","userid",userid));
        UsersDto usersDto=Mapper.mapToUsersDto(users);
        String userID=usersDto.getUserid();
        List<UsersWishListDto> usersWishListDtoList= usersWishListClient.getAllUserwishlists(userID);
        usersDto.setUsersWishListDtoList(usersWishListDtoList);
        List<BookingsDto> bookingsDtoList=bookingsClient.getAllBookingsbyUserID(userID);
        usersDto.setBookingsDtoList(bookingsDtoList);
        return usersDto;
    }

    @Override
    public UsersDto updateUserWishlist(String userid, String wishlistid) {
        usersWishListClient.updateUserwishlist(userid,wishlistid);
        UsersDto usersDto = getUserbyID(userid);
        return usersDto;
    }

}
