package com.Bonvoyage.Users.Exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
/*
    it is a custom exception class to handle the exception
    when a valid user is not liked with a valid product in the table
 */
@Getter
public class UsersApiException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;

    public UsersApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
