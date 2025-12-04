package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.ChambreDTO;

public interface Imapper {
    public ChambreDTO getChambredto(long id);
    public ChambreDTO convertToDTO(Chambre chambre);
}
