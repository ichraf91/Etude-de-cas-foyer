package com.example.foyer14.Controllers;

import com.example.foyer14.Entities.Universite;
import com.example.foyer14.Services.Iuniversite;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiUniversite")
@RequiredArgsConstructor
public class UniversiteController {
    private final Iuniversite iuniversite;

    @PutMapping("/affecterFoyerToUniv/{idUniv}/{idFoyer}")
    public Universite assignFoyerToUniv(@PathVariable long idUniv,@PathVariable long idFoyer){
       return iuniversite.affecterFoyerAUniversite(idUniv,idFoyer);
    }

    @PutMapping("/desaffecterFoyerFromUniv/{idUniv}/{idFoyer}")
    public void disassignFoyerToUniv(@PathVariable long idUniv,@PathVariable long idFoyer){
         iuniversite.desaffecterFoyerAUniversite(idUniv,idFoyer);
    }

}
