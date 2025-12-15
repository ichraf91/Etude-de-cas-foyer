package com.example.foyer14.Controllers;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.Etudiant;
import com.example.foyer14.Services.IEtudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/Etudiant")
public class EtudiantController {
    private final IEtudiant iEtudiant;

    @GetMapping("/getEtudnatParCin/{cin}")

    public Etudiant recupererEtidiantParCin(@PathVariable Long cin) {
        return iEtudiant.chercherEtdiantsParCin(cin);
    }
}
