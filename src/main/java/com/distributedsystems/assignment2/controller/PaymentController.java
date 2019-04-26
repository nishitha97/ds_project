package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.Payment;
import com.distributedsystems.assignment2.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {


    @Autowired
    PaymentService paymentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Payment addPayment(@Valid @RequestBody Payment payment) {

        return paymentService.createPayment(payment);


    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping()
    public Payment updatePayment(@Valid @RequestBody Payment payment) {

        return paymentService.updatePayment(payment);


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Payment> getPayment() {

        return paymentService.getAllPayments();


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{paymentId}")
    public Optional<Payment> getAPayment(@PathVariable("paymentId") String paymentId) {

        return paymentService.getPayment(paymentId);


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{paymentId}")
    public void deleteAPayment(@PathVariable("paymentId") String paymentId) {

        paymentService.deletePayment(paymentId);


    }

}
