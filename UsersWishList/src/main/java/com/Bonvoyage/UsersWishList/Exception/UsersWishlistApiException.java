package com.Bonvoyage.UsersWishList.Exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
/*
    it is a custom exception class to handle the exception
    when a valid user is not liked with a valid product in the table
 */
@Getter
public class UsersWishlistApiException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;

    public UsersWishlistApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
