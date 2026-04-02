package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ContratRepository;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
import tn.esprit.tic.springproj.Repository.SponsorRepository;
import tn.esprit.tic.springproj.entities.Contrat;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.entities.Sponsor;

@Service
@AllArgsConstructor
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


}
