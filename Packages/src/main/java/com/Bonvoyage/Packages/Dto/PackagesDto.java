package com.Bonvoyage.Packages.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString

public class PackagesDto {
    @NotBlank(message = "packageID should not be Empty")
    private String packageid;
    @NotBlank(message = "packageCountry should not be Empty")
    private String packagecountry;
    @NotBlank(message = "packageCity should not be Empty")
    private String packagecity;
    @NotBlank(message = "packageName should not be Empty")
    private String packagename;
    @NotBlank(message = "packageDesc should not be Empty")
    private String packagedesc;
    @NotNull(message = "packageRating should not be Null")
    private int packagerating;
    @NotNull(message = "packageReviews should not be Null")
    private int packagereviews;
    @NotBlank(message = "packagePrice should not be Empty")
    private String packageprice;
    @NotBlank(message = "packageDuration should not be Empty")
    private String packageduration;
    @NotBlank(message = "minAge should not be Empty")
    private String minage;
    @NotNull(message = "maxPeople should not be Null")
    private int maxpeople;
    @NotBlank(message = "packagePickup should not be Empty")
    private String packagepickup;
    @NotBlank(message = "availableDate should not be Empty")
    private String availabledate;
    @NotBlank(message = "packageLuggage should not be Empty")
    private String packageluggage;
    @NotBlank(message = "packageImage should not be Empty")
    private String packageimage;

    List<PackageIternaryDto> packageIternaryDtoList=new ArrayList<>();
}
