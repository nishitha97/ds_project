package com.distributedsystems.assignment2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "payments")
public class Payment {

    @Id
    private String paymentId;

    @NotNull
    private String userId;

    @NotNull
    private String ticketId;
    private boolean isCreditCardPayment=false;
    private boolean isMobilePayment=false;
    private String paymentStatus;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public boolean isCreditCardPayment() {
        return isCreditCardPayment;
    }

    public void setCreditCardPayment(boolean creditCardPayment) {
        isCreditCardPayment = creditCardPayment;
    }

    public boolean isMobilePayment() {
        return isMobilePayment;
    }

    public void setMobilePayment(boolean mobilePayment) {
        isMobilePayment = mobilePayment;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }



}
