package com.Bonvoyage.Packages.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

@Table(name = "packages")
@Entity
public class Packages {
    @Id
    @Column(nullable = false,unique = true)
    private String packageid;
    @Column(nullable = false)
    private String packagecountry;
    @Column(nullable = false)
    private String packagecity;
    @Column(nullable = false,unique = true)
    private String packagename;
    @Column(nullable = false)
    private String packagedesc;
    @Column(nullable = false)
    private int packagerating;
    @Column(nullable = false)
    private int packagereviews;
    @Column(nullable = false)
    private String packageprice;
    @Column(nullable = false)
    private String packageduration;
    @Column(nullable = false)
    private String minage;
    @Column(nullable = false)
    private int mapPeople;
    @Column(nullable = false)
    private String packagepickup;
    @Column(nullable = false)
    private String availabledate;
    @Column(nullable = false)
    private String packageluggage;
    @Column(nullable = false)
    private String packageimage;

}
