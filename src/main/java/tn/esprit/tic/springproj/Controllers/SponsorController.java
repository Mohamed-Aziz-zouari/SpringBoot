package tn.esprit.tic.springproj.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.springproj.Services.IsponsorService;


import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    IsponsorService sponsorService;

}
