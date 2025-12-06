package com.example.foyer14.Services;

import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.ChambreDTO;
import com.example.foyer14.Entities.ChambredtoMapDtruct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ChambreMapper {
    @Mapping(target = "number", source="numeroChambre")
    ChambredtoMapDtruct toDto(Chambre chambre);
    public ChambredtoMapDtruct getChambre(Long id);

}
