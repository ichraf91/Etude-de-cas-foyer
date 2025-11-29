package com.example.foyer14.Entities;

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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;

    String nomBloc;
    long capaciteBloc;
    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set<Chambre> chambres;
}
