package com.example.foyer14.Services;


import com.example.foyer14.Entities.Bloc;
import com.example.foyer14.Entities.Chambre;
import com.example.foyer14.Entities.TypeChambre;
import com.example.foyer14.Repositories.BlocRepo;
import com.example.foyer14.Repositories.ChambreRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChambreSericeImpl implements IChambreSerive {

    private final ChambreRepo chambreRepo;
    private final BlocRepo blocRepo;

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
        return chambreRepo.findChambreByNumeroChambreAndAndBloc_NomBloc(num, nom);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepo.findChambreByBlocIdBlocAndAndTypeC(idBloc, typeC);
    }

    @Override
    public List<Chambre> findChambresByTypeJPQL(TypeChambre type) {
        return chambreRepo.findChambresByType(type);
    }


    // Toutes les minutes
//    @Transactional
//        @Scheduled(cron = "* * * * * *")
//        public void listchambreparbloc() {
//
//        log.info(" Démarrage du scheduler : liste des chambres par bloc");
//
//        List<Bloc> blocs = blocRepo.findAll();
//
//        if (blocs.isEmpty()) {
//            log.warn("Aucun bloc trouvé dans la base de données");
//            return;
//        }
//
//        for (Bloc bloc : blocs) {
//            log.info("Bloc : {}", bloc.getNomBloc());
//
//            if (bloc.getChambres() == null || bloc.getChambres().isEmpty()) {
//                log.info(" Aucune chambre associée à ce bloc");
//            } else {
//                bloc.getChambres().forEach(chambre ->
//                        log.info(" Chambre {} | Type {}",
//                                chambre.getNumeroChambre(),
//                                chambre.getTypeC())
//                );
//            }
//        }
//
//        log.info("Fin du scheduler listChambreParBloc");
//    }
    @Transactional
    @Scheduled(cron = "*/5 * * * * *")
    public void pourcentageChambreParType() {

        log.info(" Calcul du pourcentage des chambres par type");

        List<Chambre> chambres = chambreRepo.findAll();

        if (chambres.isEmpty()) {
            log.warn(" Aucune chambre trouvée");
            return;
        }

        long total = chambres.size();

        Map<TypeChambre, Long> stats =
                chambres.stream()
                        .collect(Collectors.groupingBy(
                                Chambre::getTypeC,
                                Collectors.counting()
                        ));

        stats.forEach((type, count) -> {
            double pourcentage = (count * 100.0) / total;
            log.info("Type {} : {} chambres ({})%",
                    type,
                    count,
                    String.format("%.2f", pourcentage));
        });

        log.info(" Fin du calcul\n");
    }
}




