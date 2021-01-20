package com.company;

import java.util.HashMap;
import java.util.UUID;

public class MlowoBike {
    private final String bikeId;
    private boolean isLocked;
    private MedicalKit medicalKit;

    private static HashMap<String,MlowoBike> mlowoBikes = new HashMap<>();

    public MlowoBike() {
        bikeId = UUID.randomUUID().toString();
        mlowoBikes.put(bikeId, this);
    }

    public static void showAllMlowoBikes()
    {
        for (String key: mlowoBikes.keySet()) {
            System.out.println(mlowoBikes.get(key));
        }
    }
    public MedicalKit getMedicalKit() {
        return medicalKit;
    }

    public void setMedicalKit(MedicalKit medicalKit) {
        this.medicalKit = medicalKit;
    }

    public String getBikeId() {
        return bikeId;
    }

    public boolean getLockStatus(){
        return isLocked;
    }

    public void setLockStatus(boolean isLocked){
        this.isLocked = isLocked;
    }
}
