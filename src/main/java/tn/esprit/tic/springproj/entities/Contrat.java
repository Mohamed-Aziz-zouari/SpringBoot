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
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;
    private float montant;
    private String annee;
    private Boolean archived;

    @ManyToOne(fetch = FetchType.EAGER)
    private Equipe equipe;

    @ManyToOne(fetch = FetchType.EAGER)
    private Sponsor sponsor;


}
