package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.ChambreDTO;
import com.example.foyer14.Entities.ChambredtoMapDtruct;
import com.example.foyer14.Repositories.ChambreRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChambreMapperService {
    private final ChambreRepo chambreRepo;
    private final ChambreMapper chambreMapper;

    public ChambredtoMapDtruct getCham(long id){
        Chambre c= chambreRepo.findById(id).orElseThrow();
        return chambreMapper.toDto(c);
    }
}
