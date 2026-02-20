package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.DetailChampionnatRepository;

@Service
@AllArgsConstructor
public class DetailChampionnatService implements IdetailChampionnatService{
    DetailChampionnatRepository detailChampionnatRepository;
}
