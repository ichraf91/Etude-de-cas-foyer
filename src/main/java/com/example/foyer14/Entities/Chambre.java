package com.example.foyer14.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idchambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    //    @ToString.Exclude
    @ManyToOne
    @JsonIgnore
    Bloc bloc;

    @OneToMany
    Set<Reservation> reservations;
}



