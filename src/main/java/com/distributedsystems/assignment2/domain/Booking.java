package com.distributedsystems.assignment2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Domain class for Booking object
 */
@Document(collection = "bookings")
public class Booking {

    @Id
    public String id;

    public String userId;

    public String selectedTrain;

    public String noOfTickets;

    public String to;

    public String from;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSelectedTrain() {
        return selectedTrain;
    }

    public void setSelectedTrain(String selectedTrain) {
        this.selectedTrain = selectedTrain;
    }

    public String getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(String noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
