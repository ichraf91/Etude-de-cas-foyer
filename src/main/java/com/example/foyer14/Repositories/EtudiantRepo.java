package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant, Long> {
    Etudiant findEtudiantByCinEtudiant(Long cin);
}
