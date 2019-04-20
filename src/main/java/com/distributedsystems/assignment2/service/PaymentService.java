package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.Payment;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment createPayment(@Valid Payment payment);

    Payment updatePayment(@Valid Payment payment);

    List<Payment> getAllPayments();

    Optional<Payment> getPayment(String paymentId);

    void deletePayment(String paymentId);
}
