package com.example.foyer14.Services;

import com.example.foyer14.Entities.Etudiant;
import com.example.foyer14.Entities.Reservation;

public interface IReservation {
    public Reservation affecterReservationToEtudiant(Long idReserv, Long idEtud);

}
