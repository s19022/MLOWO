package com.company.HelpRecord;

import com.company.Client;
import com.company.FirstResponder;

import java.time.LocalDateTime;

public class HelpRecord {
    private Outcome outcome;
    private final String location;
    private final LocalDateTime dateTime;
    private final Client client;
    private final FirstResponder firstResponder;

    public HelpRecord(Outcome outcome, String location, LocalDateTime dateTime, Client client, FirstResponder firstResponder) {
        this.outcome = outcome;
        this.location = location;
        this.dateTime = dateTime;
        this.client = client;
        this.firstResponder = firstResponder;
    }

    private Outcome getOutcome(){
        return outcome;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getLocation() {
        return location;
    }

    public Client getClient() {
        return client;
    }

    public void setOutcome(Outcome outcome) {
        if (outcome == null) return;
        this.outcome = outcome;
    }

    public FirstResponder getFirstResponder() {
        return firstResponder;
    }
}
