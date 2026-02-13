package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Equipe;
import tn.esprit.tic.springproj.entities.Sponsor;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
