package com.Bonvoyage.Bookings.Service;

import com.Bonvoyage.Bookings.Dto.BookingsDto;
import com.Bonvoyage.Bookings.Dto.UpdateBookingsDto;

import java.util.List;

public interface BookingsService {
    // 7)
    BookingsDto updateBookings(UpdateBookingsDto updateBookingsDto);
    // 12)
    List<BookingsDto> getAllBookingsbyUserId(String userid);

    void addBookings(BookingsDto bookingsDto);


}
