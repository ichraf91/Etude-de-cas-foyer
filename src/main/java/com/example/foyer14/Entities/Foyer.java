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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;

    String nomFoyer;

    long capaciteFoyer;

    //    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
//    @JsonIgnore
            Universite universite;

    //    @JsonIgnore
//    @ToString.Exclude
    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)
    Set<Bloc> blocs;
}
