package com.fattu.Lift.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class LiftController {
    @Autowired
    LiftService liftservice;

    @PostMapping("/add_lift")
    public String addLift(@RequestBody Lift lift)  {
        liftservice.addLift(lift);
        return "Lift added";
    }

    @PostMapping("/add_passenger")
    public int addPassenger(@RequestBody Passenger passenger){
        return liftservice.hashCode();
    }

    @DeleteMapping("/delete_passenger")
    public void deletepassenger(@RequestParam  int passengerId){
        liftservice.getClass();
    }
}
