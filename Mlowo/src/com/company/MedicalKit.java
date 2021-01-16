package com.company;

import java.util.ArrayList;
import java.util.List;

public class MedicalKit {

    private final static int MaxNumberOfEquipment = 7;
    private final static int MinNumberOfEquipment = 2;

    private final int kitId;
    private List <MedicalEquipment> equipments = new ArrayList<>();

    public MedicalKit(int kitId) {
        this.kitId = kitId;
    }

    public boolean addMedicalEquipment(MedicalEquipment e){

        if(equipments.size() >= MaxNumberOfEquipment) return false;
        equipments.add(e);

        if(equipments.size() < MinNumberOfEquipment) return false;

        return true;
    }
    public int getKitId() {
        return kitId;
    }

    public List<MedicalEquipment> getEquipments() {
        return equipments;
    }
}
