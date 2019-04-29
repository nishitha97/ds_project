package com.distributedsystems.assignment2.service;

import com.distributedsystems.assignment2.domain.TrainDetails;

import java.util.List;

public interface TrainService {
    /**
     * returns list of train details
     *
     * @return List<TrainDetails>
     */
    List<TrainDetails> getDetails();
}
