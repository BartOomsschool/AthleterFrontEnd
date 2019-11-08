package com.team9.Badminton.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="land")
@Data
@NoArgsConstructor
public class Land {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="landid")
    private int landID;

    @Column (name="land")
    private String land;

    @Column (name="vlagafbeelding")
    private String vlagAfbeelding;
}
