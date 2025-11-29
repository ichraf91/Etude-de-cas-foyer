package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepo extends JpaRepository<Bloc, Long> {
}
