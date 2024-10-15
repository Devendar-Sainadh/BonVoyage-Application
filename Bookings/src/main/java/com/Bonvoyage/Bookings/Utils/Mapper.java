package com.Bonvoyage.Bookings.Utils;

import com.Bonvoyage.Bookings.BookingsApplication;
import com.Bonvoyage.Bookings.Dto.BookingsDto;
import com.Bonvoyage.Bookings.Entity.Bookings;

public class Mapper {
    public static BookingsDto mapToBookingsDto(Bookings bookings){
        return BookingsApplication.modelMapper().map(bookings,BookingsDto.class);
    }

    public static Bookings mapToBookings(BookingsDto bookingsDto){
        return BookingsApplication.modelMapper().map(bookingsDto, Bookings.class);
    }
}
