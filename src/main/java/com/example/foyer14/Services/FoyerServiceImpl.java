package com.example.foyer14.Services;

import com.example.foyer14.Entities.Foyer;
import com.example.foyer14.Repositories.BlocRepo;
import com.example.foyer14.Repositories.FoyerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoyerServiceImpl implements IFoyer{
    private final FoyerRepo foyerRepo;
    private final BlocRepo blocRepo;

    @Override
    public Foyer ajouterFoyerEtBlocs(Foyer f) {
        Foyer foyer1 = foyerRepo.save(f);
        foyer1.getBlocs().forEach(bloc -> {
            bloc.setFoyer(foyer1);
            blocRepo.save(bloc);
        });
        return foyer1;
    }
}
