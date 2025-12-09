package com.example.foyer14.Controllers;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.Foyer;
import com.example.foyer14.Services.IFoyer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiFoyer")
@RequiredArgsConstructor
public class FoyerController {
    private final IFoyer iFoyer;

    @PostMapping("/addFoyeretblocs")

    public Foyer ajouterChambre(@RequestBody Foyer f)
    {
        return iFoyer.ajouterFoyerEtBlocs(f);
    }
}
