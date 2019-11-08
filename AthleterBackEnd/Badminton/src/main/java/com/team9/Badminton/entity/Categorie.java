package com.team9.Badminton.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="categorie")
@Data
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="categorieid")
    private int categorieID;

    @Column (name="categorie")
    private String categorie;
}
