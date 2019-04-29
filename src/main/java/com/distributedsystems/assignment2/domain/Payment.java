package com.distributedsystems.assignment2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


/**
 * Domain class for Payment object
 */
@Document(collection = "payments")
public class Payment {

    @Id
    private String id;
    @NotNull
    private String bookingId;
    @NotNull
    private String userId;
    private boolean isCreditCardPayment=false;
    private boolean isMobilePayment=false;
    private String paymentStatus;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String userId) {
        this.bookingId = userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }



}
