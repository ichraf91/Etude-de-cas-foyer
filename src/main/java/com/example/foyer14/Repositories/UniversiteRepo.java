package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite, Long> {
}
