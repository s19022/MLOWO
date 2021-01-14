package com.company;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Client extends Person {
    private String homeAddress;
    private boolean isBlocked;

    private List<Bracelet> bracelets;
    private static int maxNumberOfBracelets = 1;

    public Client(String firstName, String lastName, Date dateOfBirth, String email, String phoneNumber, String password) {
        super(firstName, lastName, dateOfBirth, email, phoneNumber, password);
        bracelets = new LinkedList<>();
    }
    public void pressHelpMeButton(){}
    public void bookHealthTest(){}

    public String getHomeAddress() { return homeAddress; }
    public boolean isBlocked() { return isBlocked; }
    public void setBlocked(boolean b) { isBlocked = b; }
    public List<Bracelet> getBracelets(){return bracelets;}
    public void addBracelet(Bracelet b)
    {
        if(bracelets.size() >= 1)
            System.out.println("user has max number of bracelets");
        if(bracelets.size() < 1 && b.addClient(this)) {
            bracelets.add(b);
        }
    }
}
