package com.example.foyer14.Controllers;


import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.ChambreDTO;
import com.example.foyer14.Entities.ChambredtoMapDtruct;
import com.example.foyer14.Services.ChambreMapper;
import com.example.foyer14.Services.ChambreMapperService;
import com.example.foyer14.Services.IChambreSerive;
import com.example.foyer14.Services.Imapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chambre")
public class ChambreController {

   private final IChambreSerive iChambreSerive;
   private final Imapper imapper;
    private final ChambreMapperService chambreMapperService;


    @GetMapping("/getchambre/{idChambre}")
    public Chambre recupererChambre(@PathVariable long idChambre)
   {
       return iChambreSerive.retrieveChambre(idChambre);
   }
   @PostMapping("/addChambre")

    public Chambre ajouterChambre(@RequestBody Chambre chambre)
   {
       return iChambreSerive.addChambre(chambre);
   }
   @DeleteMapping("/deleteChambre/{idChambre}")

    public void supprimerChambre( @PathVariable long idChambre)
   {
       iChambreSerive.removeChambre(idChambre);
   }
   @GetMapping("/getAll")

    public List<Chambre> recupererList()
   {
       return iChambreSerive.retrieveAllChambres();
   }

   @PutMapping("/updateChambre")

   public Chambre MAJChambre(@RequestBody Chambre chambre)
   {
       return iChambreSerive.modifyChambre(chambre);
   }

    @GetMapping("/getchambredto/{idChambre}")
    public ChambreDTO recupererChambreDTO(@PathVariable long idChambre)
    {
        return imapper.getChambredto(idChambre);
    }
    @GetMapping("/getchambredtoMap/{idChambre}")
    public ChambredtoMapDtruct recupererChambreMAPSTRUCT(@PathVariable long idChambre)
    {
        return chambreMapperService.getCham(idChambre);
    }
}
