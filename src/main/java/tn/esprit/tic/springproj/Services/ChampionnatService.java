package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ChampionnatRepository;

@Service
@AllArgsConstructor
public class ChampionnatService implements IchampionnatService{
    ChampionnatRepository championnatRepository;
}
