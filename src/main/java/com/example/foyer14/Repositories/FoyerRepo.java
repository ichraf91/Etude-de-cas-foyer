package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer, Long> {
}
