package com.Bonvoyage.UsersWishList.Service;

import com.Bonvoyage.UsersWishList.Dto.UsersDto;
import com.Bonvoyage.UsersWishList.Dto.UsersWishListDto;
import com.Bonvoyage.UsersWishList.Entity.UsersWishList;
import com.Bonvoyage.UsersWishList.Exception.ResourceNotFoundException;
import com.Bonvoyage.UsersWishList.Feign.UsersClient;
import com.Bonvoyage.UsersWishList.Repository.UsersWishListRepository;
import com.Bonvoyage.UsersWishList.Utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsersWishListServiceImpl implements UsersWishListService{
    @Autowired
    private UsersWishListRepository usersWishListRepository;

    @Autowired
    private UsersClient usersClient;

    @Override
    public void updateUsersWishList(String userid, String wishlistid) {
        UsersDto usersDto=usersClient.getUserbyId(userid);
        UsersWishList usersWishList = usersWishListRepository.findByUserid(userid).orElseThrow(()->new ResourceNotFoundException("userwishlists","userid",userid)).getFirst();
        String wishlistId = usersWishList.getWishlistid();
        System.out.println(wishlistId);
        usersWishListRepository.deleteById(wishlistId);
        UsersWishList usersWishList1 = new UsersWishList(userid,wishlistid);
        usersWishListRepository.save(usersWishList1);
    }

    @Override
    public List<UsersWishListDto> getAllUserWishlists(String userid) {
        List<UsersWishList> usersWishListList=usersWishListRepository.findByUserid(userid).orElseThrow(()-> new ResourceNotFoundException("userwishlists","userid",userid));
        return usersWishListList.stream().map(Mapper::mapToUsersWishListDto).toList();
    }

    @Override
    public void addUserWishList(UsersWishListDto usersWishListDto) {
        UsersWishList usersWishList=Mapper.mapToUsersWishList(usersWishListDto);
        usersWishListRepository.save(usersWishList);
    }
}
