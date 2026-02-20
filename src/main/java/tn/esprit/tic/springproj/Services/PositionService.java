package tn.esprit.tic.springproj.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Repository.PositionRepository;

@Service
@AllArgsConstructor
public class PositionService implements IpositionService{
    PositionRepository positionRepository;
}
