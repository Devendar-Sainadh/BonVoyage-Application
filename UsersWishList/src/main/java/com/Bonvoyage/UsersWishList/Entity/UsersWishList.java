package com.Bonvoyage.UsersWishList.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CollectionIdJdbcTypeCode;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data

@Table(name = "users_wishlist")
@Entity
public class UsersWishList {

     @Column(nullable = false)
     private String userid;
     @Id
     @Column(nullable = false)
     private String wishlistid;
}
