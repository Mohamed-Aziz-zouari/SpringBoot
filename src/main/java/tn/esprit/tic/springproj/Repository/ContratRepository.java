package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Contrat;
import tn.esprit.tic.springproj.entities.Equipe;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
