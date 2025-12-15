package com.example.foyer14.Repositories;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre, Long> {
    Chambre findChambreByNumeroChambreAndAndBloc_NomBloc(Long num, String nom);
    List<Chambre> findChambreByBlocIdBlocAndAndTypeC(long idBloc, TypeChambre typec);
}
