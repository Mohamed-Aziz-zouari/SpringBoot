package tn.esprit.tic.springproj.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.Services.IsponsorService;
import tn.esprit.tic.springproj.entities.Sponsor;


import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    IsponsorService sponsorService;

    @PostMapping("/add-sponsor")
    public Sponsor addsponsor(@RequestBody Sponsor p) {
        return sponsorService.ajouterSponsor(p);
    }

    @PostMapping("/add-sponsors")
    public List<Sponsor> addsponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("update-sponsor")
    public Sponsor updatesponsor(@RequestBody Sponsor p) {
        return sponsorService.modifierSponsor(p);
    }

    @GetMapping("/all-sponsors")
    public List<Sponsor> getsponsors() {
        return sponsorService.listSponsors();
    }

    @DeleteMapping("/delete-sponsor/{Sponsor-id}")
    public void deletesponsor(@PathVariable ("Sponsor-id") Long SponsorId) {
        sponsorService.supprimerSponsor(SponsorId);
    }

    @GetMapping("/retrieve-sponsor/{sponsor-id}")
    public Sponsor recupererSponsor(@PathVariable("sponsor-id") Long SponsorId) {
            return sponsorService.recupererSponsor(SponsorId);
    }








}
