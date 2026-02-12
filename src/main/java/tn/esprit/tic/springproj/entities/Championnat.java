package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;
    private Categorie categorie;
    private String libelleC;
    private int annee;

    @OneToOne
    private DetailChampionnat championnatDetail;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Course> courses;
}
