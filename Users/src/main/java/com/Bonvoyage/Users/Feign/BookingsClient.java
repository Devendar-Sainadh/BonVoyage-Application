package com.Bonvoyage.Users.Feign;


import com.Bonvoyage.Users.Dto.BookingsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "bookings")
public interface BookingsClient {

    @GetMapping("/bookings/getallbookings/{userid}")
    List<BookingsDto> getAllBookingsbyUserID(@PathVariable String userid);

}
