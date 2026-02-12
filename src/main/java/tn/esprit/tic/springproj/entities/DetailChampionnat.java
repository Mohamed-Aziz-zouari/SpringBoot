package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_DetailChampionnat;
    private String code;
    private String description;

    @OneToOne(mappedBy="championnatDetail")
    private Championnat championnat;

}
