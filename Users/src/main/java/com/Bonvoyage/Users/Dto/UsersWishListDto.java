package com.Bonvoyage.Users.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

public class UsersWishListDto {

    @NotBlank(message = "UserID should not be Empty")
    private String userid;
    @NotBlank(message = "WishlistID should not be Empty")
    private String wishlistid;

}
