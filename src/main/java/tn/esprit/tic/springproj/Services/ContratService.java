package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ContratRepository;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
import tn.esprit.tic.springproj.Repository.SponsorRepository;
import tn.esprit.tic.springproj.entities.Contrat;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.entities.Sponsor;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ContratService implements IcontratService{
    ContratRepository contratRep;
    EquipeRepository equipeRep;
    SponsorRepository sponsorRep;

    public Contrat ajouterContratAffecteAUnSponsorEquipe(
            Long idEquipe, Long idSponsor) {

        Equipe e = equipeRep.findById(idEquipe).get();
        Sponsor s = sponsorRep.findById(idSponsor).get();

        Contrat contrat = new Contrat();
        contrat.setEquipe(e);
        contrat.setSponsor(s);

        return contratRep.save(contrat);
    }

    @Scheduled(cron ="*/30 * * * * *")
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe(){
        List<Contrat> contrats = contratRep.findAll();
        for (Contrat c : contrats) {
            if (Integer.parseInt(c.getAnnee()) < LocalDate.now().getYear()){
                c.setArchived(true);
                contratRep.save(c);
            }else{
            log.info("l'equipe " + c.getEquipe().getLibelle() + "a un contrat d'un montant"+c.getMontant()+"avec le sponsor"+ c.getSponsor().getNom());}

        }
    }




}
