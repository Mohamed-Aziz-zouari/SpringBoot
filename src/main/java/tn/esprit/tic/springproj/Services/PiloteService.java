package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
import tn.esprit.tic.springproj.Repository.PiloteRepository;
import tn.esprit.tic.springproj.dto.PiloteDto;
import tn.esprit.tic.springproj.entities.Categorie;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.entities.Pilote;

import java.util.List;

@Service
@AllArgsConstructor
public class PiloteService implements IpiloteService{
    PiloteRepository pp;
    EquipeRepository epreuveRep;
    @Override
    public String addPilote(Pilote pilote) {
        return pp.save(pilote).toString();
    }

    public Pilote affecterPiloteAEquipe(Long idPilote, Long idEquipe) {

        Pilote p = pp.findById(idPilote).get();
        Equipe e = epreuveRep.findById(idEquipe).get();

        p.setEquipe(e);
        pp.save(p);

        return p;
    }
    @Scheduled(cron ="* 15 11 31 12 *")
    public void updatePoints(){
    List<Pilote> pilotes = pp.findAll();
    Categorie categorie = Categorie.FORMULA1;
    for(Pilote p : pilotes){

    }
    }

    @Override
    public List<PiloteDto> listeWinners(Integer annee) {
        return pp.listeWinners(annee);
    }
}
