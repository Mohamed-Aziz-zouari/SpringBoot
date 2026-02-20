package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Championnat;
import tn.esprit.tic.springproj.entities.Equipe;

public interface ChampionnatRepository extends JpaRepository<Championnat, Long> {
}
