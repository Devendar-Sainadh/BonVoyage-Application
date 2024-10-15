package com.Bonvoyage.Bookings.Controller;


import com.Bonvoyage.Bookings.Dto.BookingsDto;
import com.Bonvoyage.Bookings.Dto.UpdateBookingsDto;
import com.Bonvoyage.Bookings.Entity.Bookings;
import com.Bonvoyage.Bookings.Service.BookingsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/bookings")
public class BookingsController {

    @Autowired
    private BookingsService bookingsService;

    // Update Bookings
    @PutMapping("/updatebookings")
    public ResponseEntity<BookingsDto> updateUserBooking(@Valid @RequestBody UpdateBookingsDto updateBookingsDto){
        return ResponseEntity.status(HttpStatus.OK).body(bookingsService.updateBookings(updateBookingsDto));
    }

    // To get All Bookings of a User
    @GetMapping("/getallbookings/{userid}")
    public ResponseEntity<List<BookingsDto>> getAllBookingsbyUserID(@PathVariable String userid){
        return ResponseEntity.status(HttpStatus.OK).body(bookingsService.getAllBookingsbyUserId(userid));
    }

    // To add Bookings
    @PostMapping("/addbookings")
    public ResponseEntity<String> addBookings(@Valid @RequestBody BookingsDto bookingsDto){
        bookingsService.addBookings(bookingsDto);
        return ResponseEntity.status(HttpStatus.FOUND).body("Bookings added Successfullyy!!!!");
    }
}
