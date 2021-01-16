package com.company;

public class MedicalEquipment {
    private final int equipmentId;
    private String producer;

    public MedicalEquipment(int equipmentId, String producer) {
        this.equipmentId = equipmentId;
        this.producer = producer;
    }
    public int getEquipmentId() {
        return equipmentId;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
