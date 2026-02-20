package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.DetailChampionnat;
import tn.esprit.tic.springproj.entities.Equipe;

public interface DetailChampionnatRepository extends JpaRepository<DetailChampionnat, Long> {
}
