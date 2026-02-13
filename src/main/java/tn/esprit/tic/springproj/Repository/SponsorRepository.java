package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.tic.springproj.entities.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {
}
