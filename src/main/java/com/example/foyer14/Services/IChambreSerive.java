package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;

import java.util.List;

public interface IChambreSerive {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);

}
