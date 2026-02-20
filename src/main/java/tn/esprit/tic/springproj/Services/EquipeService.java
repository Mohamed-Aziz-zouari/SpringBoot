package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.EquipeRepository;
import tn.esprit.tic.springproj.entities.Equipe;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
