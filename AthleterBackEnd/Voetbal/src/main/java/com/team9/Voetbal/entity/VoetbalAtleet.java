package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;
@Data
@Document(collection = "VoetbalAtleet")
public class VoetbalAtleet {
    @Id
    private String voetbalAtleetID;
    private String naam;
    private String team;
    private String positie;

}
