package com.example.testmaryembaldi.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@ToString
@EqualsAndHashCode

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    Long idMenu;
    @Column
    String libelleMenu;
    @Column
    TypeMenu typeMenu;
    @Column
    Float prixTotal;
    @ManyToMany (mappedBy = "menus",cascade = CascadeType.ALL)
    private List<Client> clients;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menu")
    private List<Composant>composants;


}
