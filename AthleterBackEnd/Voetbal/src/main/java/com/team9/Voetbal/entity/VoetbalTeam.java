package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;
@Data
@Document(collection = "VoetbalTeam")


public class VoetbalTeam {
    @Id
    private String teamID;
    private String Naam;
}
