package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPilote;
    private String libelleP;
    private int nbPointsTotal;
    private int classementGeneral;
    private Categorie categorie;
}
