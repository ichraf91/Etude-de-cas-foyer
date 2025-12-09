package com.example.foyer14.Controllers;

import com.example.foyer14.Entities.Reservation;
import com.example.foyer14.Services.IReservation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiReservation")
@RequiredArgsConstructor
public class ReservationController {
private final IReservation iReservation;
    @PutMapping("/affecter-reserv-AEtud/{idReserv}/{idEtud}")
    public Reservation affecterReservationToEtudiant (@PathVariable Long idReserv,
                                           @PathVariable Long idEtud) {
        return iReservation.affecterReservationToEtudiant(idReserv,idEtud);
    }
}
