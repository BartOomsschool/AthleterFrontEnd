package com.team9.Badminton.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Athleet")
@Data
@NoArgsConstructor
public class Athleet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="athleetID")
    private int athleetID;

 /*   @Column (name="categorieID")
    private int categoieID;*/

    @ManyToOne
    @JoinColumn(name="categorieID")
    private Categorie categorie;

    @Column (name="rank")
    private int rank;

  /*  @Column (name="landID")
    private int landID;*/

    @ManyToOne
    @JoinColumn(name="landID")
    private Land land;

    @Column (name="naam")
    private String naam;
    @Column (name="punten")
    private int punten;
    @Column (name="toernooien")
    private int toernooien;
    @Column (name="afbeelding")
    private String afbeelding;

/*    @Column (name="partnerID")
    private Integer partnerID;*/

    @ManyToOne
    @JoinColumn(name="partnerID")
    private Athleet partner;
}
