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
