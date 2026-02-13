package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Pilote;
import tn.esprit.tic.springproj.entities.Sponsor;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}
