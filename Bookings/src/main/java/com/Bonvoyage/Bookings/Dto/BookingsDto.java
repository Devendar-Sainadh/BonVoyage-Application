package com.Bonvoyage.Bookings.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString

public class BookingsDto {
    @NotBlank(message = "userID should not be Empty")
    private String userid;
    @NotBlank(message = "bookingID should not be Empty")
    private String bookingid;
    @NotBlank(message = "packageID should not be Empty")
    private String packageid;
    @NotBlank(message = "packageName should not be Empty")
    private String packagename;
    @NotNull(message = "bookingDate should not be Null")
    private String bookingdate;
    @NotBlank(message = "packageImage should not be Empty")
    private String packageimage;
    @NotNull(message = "bookingPerson should not be Null")
    private int bookingperson;
    @NotNull(message = "bookingRooms should not be Null")
    private int bookingrooms;
}
