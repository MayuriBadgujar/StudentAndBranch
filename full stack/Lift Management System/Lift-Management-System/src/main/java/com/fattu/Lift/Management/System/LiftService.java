package com.fattu.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service

public class LiftService {
    @Autowired
    LiftRepository liftrepository;

    public void addLift(Lift lift){
         liftrepository.addLift(lift);
      //  return "Lift added";
    }
    public String  addPassenger(@RequestBody Passenger passenger){
        return liftrepository.addPassenger(passenger);
    }
    public void deletepassenger(@RequestParam int passengerId){
        liftrepository.deletepassenger(passengerId);
    }
}
