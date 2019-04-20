package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.Payment;
import com.distributedsystems.assignment2.repository.PaymentRepository;
import com.distributedsystems.assignment2.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(@Valid Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(@Valid Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> getPayment(String paymentId) {
        return paymentRepository.findById(Integer.parseInt(paymentId));
    }

    @Override
    public void deletePayment(String paymentId) {
       paymentRepository.deleteById(Integer.parseInt(paymentId));
    }
}
