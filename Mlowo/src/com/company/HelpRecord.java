package com.company;

import java.time.LocalDateTime;

public class HelpRecord {
    private Outcome outcome;
    private final String location;
    private final LocalDateTime dateTime;
    public HelpRecord( LocalDateTime dateTime, Outcome outcome, String location) {
        this.dateTime = dateTime;
        this.outcome = outcome;
        this.location = location;
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
}
