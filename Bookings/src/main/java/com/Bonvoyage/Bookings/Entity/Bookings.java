package com.Bonvoyage.Bookings.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

@Table(name = "bookings")
@Entity
public class Bookings {
    @Column(nullable = false)
    private String userid;

    @Id
    @Column(nullable = false,length = 36)
    private String bookingid;

    @Column(nullable = false)
    private String packageid;
    @Column(nullable = false)
    private String packagename;
    @Column(nullable = false)
    private String bookingdate;
    @Column(nullable = false)
    private String packageimage;
    @Column(nullable = false)
    private int bookingperson;
    @Column(nullable = false)
    private int bookingrooms;
}
