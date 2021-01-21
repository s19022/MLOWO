package com.company;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class MedicalCard {
    private final String medicalCardId;
    private LocalDateTime expirationDate;
    private String owner;
    public static HashMap<String,MedicalCard> medicalCards = new HashMap<>();


    public MedicalCard(LocalDateTime expirationDate, String owner) {
        this.medicalCardId = UUID.randomUUID().toString();
        this.expirationDate = expirationDate;
        this.owner=owner;
        medicalCards.put(medicalCardId, this);
    }

    public static boolean contains(MedicalCard medicalCard){
        return medicalCards.containsValue(medicalCard);
    }

    public String getOwner(){return owner;}

    public LocalDateTime getExpirationDate(){return expirationDate;}

    public String getMedicalCardId(){return medicalCardId;}


}
