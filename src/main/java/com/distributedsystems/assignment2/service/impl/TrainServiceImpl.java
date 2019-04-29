package com.distributedsystems.assignment2.service.impl;

import com.distributedsystems.assignment2.domain.TrainDetails;
import com.distributedsystems.assignment2.repository.TrainDetailRepository;
import com.distributedsystems.assignment2.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    TrainDetailRepository trainDetailRepository;

    @Override
    public List<TrainDetails> getDetails() {
        return  trainDetailRepository.findAll();
    }
}
