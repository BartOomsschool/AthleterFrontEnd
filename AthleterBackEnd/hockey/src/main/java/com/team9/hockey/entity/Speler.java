package com.team9.hockey.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "speler")
public class Speler {
    @Id
    private String ID;
    private String naam;
    private Date geboortedatum;
    private Integer teamID;
    private Integer positieID;

}
