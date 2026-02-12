package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPsition;
    private int classment;
    private int nbPoints;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Pilote pilote;

}
