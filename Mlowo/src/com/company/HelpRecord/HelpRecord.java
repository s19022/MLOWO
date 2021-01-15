package com.company.HelpRecord;

import com.company.Client;
import com.company.FirstResponder;

import java.time.LocalDateTime;
import java.util.Objects;

public class HelpRecord {
    private Outcome outcome;
    private final String location;
    private final LocalDateTime time;
    private final Client client;
    private final FirstResponder firstResponder;

    public HelpRecord(Outcome outcome, String location, LocalDateTime dateTime, Client client, FirstResponder firstResponder) {
        this.outcome = outcome;
        this.location = location;
        this.time = dateTime;
        this.client = client;
        this.firstResponder = firstResponder;
        client.addHelpRecord(this);
        firstResponder.addHelpRecord(this);
    }

    public Outcome getOutcome(){
        return outcome;
    }

    public LocalDateTime getTime() {
        return time;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HelpRecord)) return false;
        HelpRecord that = (HelpRecord) o;
        return getOutcome() == that.getOutcome() &&
                Objects.equals(getLocation(), that.getLocation()) &&
                Objects.equals(getTime(), that.getTime()) &&
                Objects.equals(getClient(), that.getClient()) &&
                Objects.equals(getFirstResponder(), that.getFirstResponder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOutcome(), getLocation(), getTime(), getClient(), getFirstResponder());
    }
}
