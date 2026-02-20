package tn.esprit.tic.springproj.Repository;

import tn.esprit.tic.springproj.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.entities.Equipe;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
