package com.distributedsystems.assignment2.controller;


import com.distributedsystems.assignment2.domain.Booking;
import com.distributedsystems.assignment2.domain.TrainDetails;
import com.distributedsystems.assignment2.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/trains")
/**
 * controller class to handle all train services
 *
 * @author IT17006880
 */
public class TrainScheduleController {

    @Autowired
    TrainService trainService;

    /**
     * controller to retrieve train details stored in the database
     *
     * @return ResponseEntity containing the list of train details available
     */
    @GetMapping()
    public ResponseEntity<List<TrainDetails>> geTrainDetails() {

        return ResponseEntity.status(HttpStatus.OK).body(trainService.getDetails());

    }
}


