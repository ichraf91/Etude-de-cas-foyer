package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.TypeChambre;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IChambreSerive {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    Chambre chercherParNumEtBloc(Long num, String nom);

    public List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre
            typeC);
    List<Chambre> findChambresByTypeJPQL(TypeChambre type);
    //void listchambreparbloc();
    public void pourcentageChambreParType() ;


    }
