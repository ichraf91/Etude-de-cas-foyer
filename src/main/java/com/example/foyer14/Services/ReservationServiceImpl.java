package com.example.foyer14.Services;

import com.example.foyer14.Entities.Etudiant;
import com.example.foyer14.Entities.Reservation;
import com.example.foyer14.Repositories.EtudiantRepo;
import com.example.foyer14.Repositories.ReservationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservation{
    private final EtudiantRepo etudiantRepo;
    private final ReservationRepo reservationRepo;


    public Reservation affecterReservationToEtudiant(Long idReserv, Long idEtud) {
        Reservation r = reservationRepo.findById(idReserv).get();
        Etudiant e = etudiantRepo.findById(idEtud).get();
        Set<Etudiant> etudiantsMiseAjour = new HashSet<>();
        if (r.getEtudiants()!=null){
            etudiantsMiseAjour=r.getEtudiants();
        }
        etudiantsMiseAjour.add(e);
        r.setEtudiants(etudiantsMiseAjour);
        reservationRepo.save(r);
        return r;
}
}
