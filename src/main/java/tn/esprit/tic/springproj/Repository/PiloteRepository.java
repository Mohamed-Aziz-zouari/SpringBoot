package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.springproj.dto.PiloteDto;
import tn.esprit.tic.springproj.entities.Pilote;
import tn.esprit.tic.springproj.entities.Sponsor;

import java.util.List;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {

    @Query("""
        SELECT new tn.esprit.tic.springproj.dto.PiloteDto(
            p.libelleP,
            p.nbPointsTotal,
            c.libelleC
        )
        FROM Pilote p
        JOIN p.Positions pos
        JOIN pos.course co
        JOIN co.Championnats c
        WHERE c.annee > :annee
        AND p.classementGeneral = 1
    """)
    List<PiloteDto> listeWinners(@Param("annee") Integer annee);
}
