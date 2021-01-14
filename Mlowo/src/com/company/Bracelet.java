package com.company;

import java.awt.*;
import java.util.UUID;
import java.util.*;

public class Bracelet {
    private String braceletId;
    private boolean isActive;
    private Color color; 

    private static HashMap<String, Bracelet> bracelets = new HashMap<String, Bracelet>();

    public Bracelet(boolean isActive, Color color) {
        this.isActive = isActive;
        this.color = color;

        String uniqueKey = UUID.randomUUID().toString();
        switch(bracelets.containsKey(uniqueKey) + "")
        {
            case "false":
                    this.braceletId = uniqueKey;
                bracelets.put(uniqueKey, this);
            break;
            case "true": // is it even possible???, probably not
                System.out.println("Generated id is not unique");
            break;
        }
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