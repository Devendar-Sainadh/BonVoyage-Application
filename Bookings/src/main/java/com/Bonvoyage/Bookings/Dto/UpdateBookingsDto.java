package com.Bonvoyage.Bookings.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString

public class UpdateBookingsDto {
    @NotBlank(message = "userID should not be Empty")
    private String userid;
    @NotBlank(message = "bookingID should not be Empty")
    private String bookingid;
    @NotBlank(message = "bookingPackage should not be Empty")
    private String packageid;
    @NotNull(message = "bookingDate should not be Null")
    private String bookingdate;
    @NotNull(message = "bookingPerson should not be Null")
    private int bookingperson;
    @NotNull(message = "bookingRooms should not be Null")
    private int bookingrooms;

}
