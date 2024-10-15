package com.Bonvoyage.Bookings.Service;

import com.Bonvoyage.Bookings.Dto.BookingsDto;
import com.Bonvoyage.Bookings.Dto.UpdateBookingsDto;
import com.Bonvoyage.Bookings.Entity.Bookings;
import com.Bonvoyage.Bookings.Exception.ResourceNotFoundException;
import com.Bonvoyage.Bookings.Repository.BookingRepository;
import com.Bonvoyage.Bookings.Utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingsServiceImpl implements BookingsService{

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public BookingsDto updateBookings(UpdateBookingsDto updateBookingsDto) {
        String bookingID=updateBookingsDto.getBookingid();
        Bookings bookings=bookingRepository.findById(bookingID).orElseThrow(()-> new ResourceNotFoundException("Booking","bookingid",bookingID));
        bookings.setPackageid(updateBookingsDto.getPackageid());
        bookings.setBookingdate(updateBookingsDto.getBookingdate());
        bookings.setBookingperson(updateBookingsDto.getBookingperson());
        bookings.setBookingrooms(updateBookingsDto.getBookingrooms());
        Bookings bookings1=bookingRepository.save(bookings);
        return Mapper.mapToBookingsDto(bookings1);
    }

    @Override
    public List<BookingsDto> getAllBookingsbyUserId(String userid) {
        List<Bookings> bookingsList= bookingRepository.findByUserid(userid).orElseThrow(()-> new ResourceNotFoundException("Booking","userid",userid));
        return bookingsList.stream().map(Mapper::mapToBookingsDto).toList();
    }

    @Override
    public void addBookings(BookingsDto bookingsDto) {
        Bookings bookings=Mapper.mapToBookings(bookingsDto);
        bookingRepository.save(bookings);
    }
}
