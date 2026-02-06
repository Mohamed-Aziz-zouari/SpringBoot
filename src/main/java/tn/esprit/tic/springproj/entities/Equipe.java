package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe;
    private String libelle;
    private int nbPointsTotal;
    private int classementGeneral;
}
