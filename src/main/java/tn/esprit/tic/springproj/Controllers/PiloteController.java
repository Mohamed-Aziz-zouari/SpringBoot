package tn.esprit.tic.springproj.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.springproj.Services.IpiloteService;



@RestController
@AllArgsConstructor
public class PiloteController  {
    IpiloteService piloteService;
}
