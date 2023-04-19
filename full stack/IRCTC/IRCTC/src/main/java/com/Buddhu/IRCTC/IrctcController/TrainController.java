package com.Buddhu.IRCTC.IrctcController;

import com.Buddhu.IRCTC.Entity.Passenger;
import com.Buddhu.IRCTC.Entity.Train;
import com.Buddhu.IRCTC.IrctcService.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {
    @Autowired
    TrainService trainService;
    @PostMapping("/addTrain")
    public String addTrain(@RequestBody Train train){
        trainService.addTrain(train);
        return "Train added Successfully";
    }
}
