package com.company;

import com.company.Subscription.Subscription;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client extends Person {
    private final static int maxNumberOfBracelets = 1;

    private String homeAddress;
    private boolean isBlocked;

    private List<Bracelet> bracelets = new ArrayList<>();
    private List<Subscription> subscriptions = new ArrayList<>();

    public Client(String firstName, String lastName, LocalDateTime dateOfBirth, String email, String phoneNumber, String password, String homeAddress) {
        super(firstName, lastName, dateOfBirth, email, phoneNumber, password);
        this.homeAddress = homeAddress;
    }
    public void pressHelpMeButton(){}
    public void bookHealthTest(){}

    public String getHomeAddress() { return homeAddress; }

    public boolean isBlocked() { return isBlocked; }

    public void setBlocked(boolean b) { isBlocked = b; }

    public List<Bracelet> getBracelets(){return bracelets;}

    public synchronized boolean addBracelet(Bracelet b) {
        if(bracelets.size() >= maxNumberOfBracelets) return false;
   //         System.out.println("user has max number of bracelets");
        if(!b.addClient(this)) return false;
        bracelets.add(b);
        return true;
    }

    public synchronized boolean addSubscription(Subscription subscription){
        if (subscription.isExpired()) return false;
        if (!subscription.setClient(this)) return false;
        subscriptions.add(subscription);
        return true;
    }
}
