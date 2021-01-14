package com.company;

import java.awt.*;
import java.util.List;
import java.util.UUID;
import java.util.*;

public class Bracelet {

    private final String braceletId;
    private boolean isActive;
    private final Color color; 

    private static HashMap<String, Bracelet> bracelets = new HashMap<>();

    private List<Client> clients;
    private static int maxNumberOfClients = 1;

    public Bracelet(boolean isActive, Color color) {
        this.isActive = isActive;
        this.color = color;

        clients = new LinkedList<>();

        braceletId = UUID.randomUUID().toString();

        bracelets.put(braceletId, this);
    }

    public boolean addClient(Client c)
    {
        if(clients.size() >= maxNumberOfClients)
        {
            System.out.println("bracelet has max number of clients");
            return false;
        }
        clients.add(c);
        return  true;
    }

    public static void showAllBracelets()
    {
        for (String key: bracelets.keySet()) {
            System.out.println(bracelets.get(key));
        }
    }

    public int measureHeartRate(){ return 0; }
    public void sendHelpSignal(){}

    public String getBraceletId() {
        return braceletId;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean b) { isActive = b; }

    public Color getColor() {
        return color;
    }
}