package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
