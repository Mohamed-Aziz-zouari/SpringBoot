package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;
    private float montant;
    private String annee;
    private Boolean archived;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Sponsor sponsor;


}
