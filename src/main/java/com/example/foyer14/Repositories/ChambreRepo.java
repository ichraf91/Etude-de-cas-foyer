package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre, Long> {
}
