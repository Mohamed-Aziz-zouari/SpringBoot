package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
import tn.esprit.tic.springproj.Repository.PiloteRepository;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.entities.Pilote;

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
}
