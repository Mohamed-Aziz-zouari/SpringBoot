package tn.esprit.tic.springproj.Services;

import tn.esprit.tic.springproj.Repository.SponsorRepository;
import tn.esprit.tic.springproj.entities.Sponsor;

import java.time.LocalDate;
import java.util.List;

public class SponsorService implements IsponsorService{
    SponsorRepository sp;
    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return sp.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        for (Sponsor sponsor : sponsors) {
            sponsor.setDateCreation(LocalDate.now());
            sponsor.setArchived(false);
            sponsor.setBloquerContrat(false);
        }
        return sp.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sp.findById(idSponsor).orElse(null);
        sponsor.setArchived(true);
        sp.save(sponsor);
        return true;
    }
}
