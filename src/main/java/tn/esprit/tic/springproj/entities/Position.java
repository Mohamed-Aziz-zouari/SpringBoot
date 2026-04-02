package tn.esprit.tic.springproj.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
