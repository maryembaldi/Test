package com.example.testmaryembaldi.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
@Table(name = "Composant")

public class Composant {
    @Id
    Long idComposant;
    @Column
    String nomComposant;
    @Column
    Float prix;
    @ManyToOne
    Menu menu;

}
