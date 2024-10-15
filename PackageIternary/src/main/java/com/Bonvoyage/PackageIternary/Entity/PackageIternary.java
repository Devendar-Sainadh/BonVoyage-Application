package com.Bonvoyage.PackageIternary.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

@Table(name = "package_iternary")
@Entity
public class PackageIternary {
    @Id
    @Column(nullable = false)
    private String packageiternaryid;
    @Column(nullable = false)
    private String packageid;
    @Column(nullable = false)
    private String day;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String activities;

}
