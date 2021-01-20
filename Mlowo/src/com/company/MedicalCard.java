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


    public MedicalCard(String medicalCardId, LocalDateTime expirationDate, String owner) {
        this.medicalCardId = UUID.randomUUID().toString();
        this.expirationDate = expirationDate;
        owner = owner;
        medicalCards.put(medicalCardId, this);
    }
}
