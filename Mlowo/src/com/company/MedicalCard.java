package com.company;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class MedicalCard {
    private final String medicalCardId;
    private Date expirationDate;
    private String Owner;
    public static HashMap<String,MedicalCard> medicalCards = new HashMap<>();


    public MedicalCard(String medicalCardId, Date expirationDate, String owner) {
        this.medicalCardId = UUID.randomUUID().toString();
        this.expirationDate = expirationDate;
        Owner = owner;
        medicalCards.put(medicalCardId, this);
    }
}
