package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Payment;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    /**
     * create a payment object
     *
     * @param payment object
     * @return Payment object after creation
     */
    Payment createPayment(@Valid Payment payment);

    /**
     *update a payment object
     *
     * @param payment object
     * @return Payment object after update
     */
    Payment updatePayment(@Valid Payment payment);

    /**
     *finds and returns all payments
     *
     * @return list of Payments
     */
    List<Payment> getAllPayments();


    /**
     *finds payment object based on id
     *
     * @param paymentId id of Payment object
     * @return Payment object
     */
    Optional<Payment> getPayment(String paymentId);


    /**
     *deletes payment object based on id
     *
     * @param paymentId payment object id
     */

    void deletePayment(String paymentId);
}
