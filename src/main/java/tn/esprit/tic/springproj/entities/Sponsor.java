package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSponsor;
    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerConrat;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy="sponsor")
    private List<Contrat> contrats;


}
