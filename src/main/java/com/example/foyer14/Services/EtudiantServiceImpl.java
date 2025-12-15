package com.example.foyer14.Services;

import com.example.foyer14.Entities.Etudiant;
import com.example.foyer14.Entities.Reservation;
import com.example.foyer14.Repositories.EtudiantRepo;
import com.example.foyer14.Repositories.ReservationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements IEtudiant{

private final EtudiantRepo etudiantRepo;


    @Override
    public Etudiant chercherEtdiantsParCin(Long cin) {
        return etudiantRepo.findEtudiantByCinEtudiant(cin);
    }
}
