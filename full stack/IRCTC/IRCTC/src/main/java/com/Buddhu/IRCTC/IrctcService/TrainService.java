package com.Buddhu.IRCTC.IrctcService;

import com.Buddhu.IRCTC.Entity.Train;
import com.Buddhu.IRCTC.IrctcRepository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
    @Autowired
    TrainRepository trainRepository;

    public void addTrain(Train train) {
        trainRepository.save(train);
    }
}
