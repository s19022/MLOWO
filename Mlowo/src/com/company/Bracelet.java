package com.company;

import java.awt.*;
import java.util.UUID;
import java.util.*;

public class Bracelet {

    private final String braceletId;
    private boolean isActive;
    private final Color color; 

    private static HashMap<String, Bracelet> bracelets = new HashMap<>();

    public Bracelet(boolean isActive, Color color) {
        this.isActive = isActive;
        this.color = color;

        braceletId = UUID.randomUUID().toString();

        bracelets.put(braceletId, this);
    }

    public static void showAllBracelets()
    {
        for (String key: bracelets.keySet()) {
            System.out.println(bracelets.get(key));
        }
    }

    public void measureHeartRate(){}
    public void sendHelpSignal(){}

    public String getBraceletId() {
        return braceletId;
    }

    public boolean isActive() {
        return isActive;
    }

    public Color getColor() {
        return color;
    }
}