package tn.esprit.tic.springproj.Services;

import tn.esprit.tic.springproj.dto.PiloteDto;
import tn.esprit.tic.springproj.entities.Pilote;
import tn.esprit.tic.springproj.entities.Sponsor;

import java.util.List;

public interface IpiloteService {
    String addPilote(Pilote pilote);
    List<PiloteDto> listeWinners(Integer annee);
}
