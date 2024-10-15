package com.Bonvoyage.Users.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

@Table(name = "users")
@Entity
public class Users {

    @Id
    @Column(nullable = false,unique = true)
    private String userid;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false,unique = true)
    private String useremail;
    @Column(nullable = false,unique = true)
    private double userphone;
    @Column(nullable = false)
    private String userpassword;
    @Column(nullable = false)
    private String useraddress;
    @Column(nullable = false)
    private String userrole;
}
