package com.distributedsystems.assignment2.controller;

import com.distributedsystems.assignment2.domain.Payment;
import com.distributedsystems.assignment2.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @PostMapping()
    public ResponseEntity<Payment> addPayment(@Valid @RequestBody Payment payment) {

        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.createPayment(payment));


    }

    @PutMapping()
    public ResponseEntity<Payment> updatePayment(@Valid @RequestBody Payment payment) {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.updatePayment(payment));


    }



    @GetMapping()
    public ResponseEntity<List<Payment>> getPayment() {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getAllPayments());


    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{paymentId}")
    public ResponseEntity<Optional<Payment>> getAPayment(@PathVariable("paymentId") String paymentId) {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getPayment(paymentId));


    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{paymentId}")
    public void deleteAPayment(@PathVariable("paymentId") String paymentId) {

        paymentService.deletePayment(paymentId);


    }

}
