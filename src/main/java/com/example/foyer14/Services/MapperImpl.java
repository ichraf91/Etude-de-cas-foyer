package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.ChambreDTO;
import com.example.foyer14.Repositories.ChambreRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MapperImpl implements Imapper{
    private final ChambreRepo chambrerepo;
    @Override
    public ChambreDTO getChambredto(long id) {
        Chambre chambre =chambrerepo.findById(id).orElseThrow(null);
        return convertToDTO(chambre);
    }

    @Override
    public ChambreDTO convertToDTO(Chambre chambre) {
        ChambreDTO dto = new ChambreDTO();
        dto.setNumeroChambre(chambre.getNumeroChambre());
        return dto;
    }
}
