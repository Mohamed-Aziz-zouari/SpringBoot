package tn.esprit.tic.springproj.Services;

import tn.esprit.tic.springproj.entities.Sponsor;

import java.time.LocalDate;
import java.util.List;

public interface IsponsorService {


    Sponsor ajouterSponsor(Sponsor sponsor);

    List<Sponsor> ajouterSponsors(List<Sponsor> sponsors);

    Sponsor modifierSponsor(Sponsor sponsor);

    void supprimerSponsor (Long idSponsor);

    List<Sponsor> listSponsors();

    Sponsor recupererSponsor(Long idSponsor);

    Boolean archiverSponsor(Long idSponsor);
}
