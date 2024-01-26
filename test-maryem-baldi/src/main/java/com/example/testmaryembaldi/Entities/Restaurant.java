package com.example.testmaryembaldi.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id
    Long idRestaurant;
    @Column
    String nom;
    @Column
    Long nbOlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Menu> menus;

}
