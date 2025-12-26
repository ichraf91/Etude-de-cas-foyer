package com.example.foyer14.Services;


import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.TypeChambre;
import com.example.foyer14.Repositories.ChambreRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreSericeImpl implements IChambreSerive{

    private final ChambreRepo chambreRepo;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepo.findById(chambreId).orElseThrow();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepo.deleteById(chambreId);
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public Chambre chercherParNumEtBloc(Long num, String nom) {
        return chambreRepo.findChambreByNumeroChambreAndAndBloc_NomBloc(num,nom);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepo.findChambreByBlocIdBlocAndAndTypeC(idBloc,typeC);
    }

    @Override
    public List<Chambre> findChambresByTypeJPQL(TypeChambre type) {
        return chambreRepo.findChambresByType(type);
    }
}
