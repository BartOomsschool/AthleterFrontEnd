package com.team9.Badminton.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="badmintonatleet")
@Data
@NoArgsConstructor
public class Badmintonatleet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="atleetID")
    private int atleetID;

    @Column (name="categorie")
    private String categorie;

    @Column (name="rank")
    private int rank;

    @Column (name="land")
    private String land;

    @Column (name="naam")
    private String naam;

    @Column (name="punten")
    private int punten;

    @Column (name="toernooien")
    private int toernooien;

    @Column (name="afbeelding")
    private String afbeelding;

    @Column (name="partnerID")
    private Integer partnerID;
}
