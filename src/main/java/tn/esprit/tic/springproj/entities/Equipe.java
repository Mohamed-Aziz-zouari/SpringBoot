package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe;
    private String libelle;
    private int nbPointsTotal;
    private int classementGeneral;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Pilote> Pilotes;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.PERSIST)
    private List<Contrat> contarts;
}
