package com.example.testmaryembaldi.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@ToString
@EqualsAndHashCode

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity //obligatoire : entité JPA
@Table(name = "Client")
public class Client {
    @Id
    Long idClient;
    @Column
    String identifiant;
    @Column
    LocalDate datePremiereVisite;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Menu>menus;
}
