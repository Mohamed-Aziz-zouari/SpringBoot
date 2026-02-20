package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.ContratRepository;

@Service
@AllArgsConstructor
public class ContratService implements IcontratService{
    ContratRepository Contratrepo;
}
