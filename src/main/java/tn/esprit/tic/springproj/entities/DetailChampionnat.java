package tn.esprit.tic.springproj.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetailChampionnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_DetailChampionnat;
    private String code;
    private String description;


}
