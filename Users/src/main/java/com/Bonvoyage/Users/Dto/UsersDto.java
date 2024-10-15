package com.Bonvoyage.Users.Dto;


import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

public class UsersDto {
    @NotBlank(message = "userID should not be Empty")
    private String userid;
    @NotBlank(message = "userName should not be Empty")
    private String username;
    @NotBlank(message = "userEmail should not be Empty")
    @Email(message = "Enter a Valid Email")
    private String useremail;
    @NotNull(message = "userPhone should not be Null")
    private double userphone;
    @NotBlank(message = "userPassword should not be Empty")
    private String userpassword;
    @NotBlank(message = "userAddress should not be Empty")
    private String useraddress;
    @NotBlank(message = "userRole should not be Empty")
    private String userrole;

    List<UsersWishListDto> usersWishListDtoList=new ArrayList<>();

    List<BookingsDto> bookingsDtoList=new ArrayList<>();
}
