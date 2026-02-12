package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPilote;
    private String libelleP;
    private int nbPointsTotal;
    private int classementGeneral;
    private Categorie categorie;

    @OneToMany(mappedBy = "pilote", cascade = CascadeType.PERSIST)
    private List<Position> Positions;

    @ManyToOne
    private Equipe equipe;
}
