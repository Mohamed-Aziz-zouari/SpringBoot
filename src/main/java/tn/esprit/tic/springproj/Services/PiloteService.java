package tn.esprit.tic.springproj.Services;

import tn.esprit.tic.springproj.Repository.PiloteRepository;
import tn.esprit.tic.springproj.entities.Pilote;

public class PiloteService implements IpiloteService{
    PiloteRepository pp;
    @Override
    public String addPilote(Pilote pilote) {
        return pp.save(pilote).toString();
    }
}
