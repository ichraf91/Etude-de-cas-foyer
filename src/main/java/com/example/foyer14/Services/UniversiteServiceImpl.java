package com.example.foyer14.Services;

import com.example.foyer14.Entities.Foyer;
import com.example.foyer14.Entities.Universite;
import com.example.foyer14.Repositories.FoyerRepo;
import com.example.foyer14.Repositories.UniversiteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImpl implements Iuniversite{
   private final UniversiteRepo universiteRepo;
   private final FoyerRepo foyerRepo;

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, long idUniversite) {
        Foyer f = foyerRepo.findById(idFoyer).get();
        Universite u = universiteRepo.findById(idUniversite).get();
        u.setFoyer(f);
        universiteRepo.save(u);
        return u;
    }
}
