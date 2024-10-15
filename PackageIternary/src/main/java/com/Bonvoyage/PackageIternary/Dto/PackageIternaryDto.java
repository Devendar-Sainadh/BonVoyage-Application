package com.Bonvoyage.PackageIternary.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString

public class PackageIternaryDto {
    @NotBlank(message = "packageIternaryID should not be Empty")
    private String packageiternaryid;
    @NotBlank(message = "packageID should not be Empty")
    private String packageid;
    @NotBlank(message = "Day should not be Empty")
    private String day;
    @NotBlank(message = "Title should not be Empty")
    private String title;
    @NotBlank(message = "Activities should not be Empty")
    private String activities;
}
