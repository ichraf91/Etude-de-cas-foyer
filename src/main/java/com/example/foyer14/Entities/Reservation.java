package com.example.foyer14.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;

    LocalDate anneeUniversitaire;

    boolean estValide;

    //    @ToString.Exclude
    @ManyToMany
    Set<Etudiant> etudiants;
}
