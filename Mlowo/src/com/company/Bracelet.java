package com.company;

import java.awt.*;

public class Bracelet {
    private int braceletId;
    private boolean isActive;
    private Color color;

    public Bracelet(int braceletId, boolean isActive, Color color) {
        this.braceletId = braceletId;
        this.isActive = isActive;
        this.color = color;
    }
    public void measureHeartRate(){}
    public void sendHelpSignal(){}

    public int getBraceletId() {
        return braceletId;
    }

    public boolean isActive() {
        return isActive;
    }

    public Color getColor() {
        return color;
    }
}
