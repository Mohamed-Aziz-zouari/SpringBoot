package tn.esprit.tic.springproj.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.tic.springproj.Services.IpositionService;

@RestController
@AllArgsConstructor
public class PositionController  {
    IpositionService positionService;
}
