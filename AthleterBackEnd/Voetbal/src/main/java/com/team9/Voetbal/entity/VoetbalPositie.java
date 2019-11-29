package com.team9.Voetbal.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;
@Data
@Document(collection = "VoetbalPositie")

public class VoetbalPositie {
    @Id
    private String positieID;
    private String number;
}
