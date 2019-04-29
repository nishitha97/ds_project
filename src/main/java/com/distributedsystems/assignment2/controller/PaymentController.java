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
/**
 * controller class to handle all payment services
 *
 * @author IT17006880
 */
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    /**
     * controller to create a new payment
     *
     * @param payment Payment object
     * @return ResponseEntity containing the created user
     */
    @PostMapping()
    public ResponseEntity<Payment> addPayment(@Valid @RequestBody Payment payment) {

        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.createPayment(payment));

    }

    /**
     * controller to update a  payment
     *
     * @param payment Payment object
     * @return ResponseEntity containing the updated user
     */
    @PutMapping()
    public ResponseEntity<Payment> updatePayment(@Valid @RequestBody Payment payment) {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.updatePayment(payment));

    }

    /**
     * controller to retrieve all payment details
     *
     * @return ResponseEntity containing a list of available payments
     */
    @GetMapping()
    public ResponseEntity<List<Payment>> getPayment() {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getAllPayments());

    }

    /**
     * controller to retrieve a payment detail given the id
     *
     * @param paymentId Payment id
     * @return ResponseEntity containing the given Payment
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{paymentId}")
    public ResponseEntity<Optional<Payment>> getAPayment(@PathVariable("paymentId") String paymentId) {

        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getPayment(paymentId));

    }

    /**
     * controller to delete a payment detail given the id
     *
     * @param paymentId Payment id
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{paymentId}")
    public void deleteAPayment(@PathVariable("paymentId") String paymentId) {

        paymentService.deletePayment(paymentId);

    }

}
