package com.fattu.Lift.Management.System;

import java.util.HashMap;

@org.springframework.stereotype.Repository
public class LiftRepository {

    HashMap<String,Lift> liftHashMap=new HashMap<>();
    HashMap<String,Passenger> passengerHashMap=new HashMap<>();

    public  void addLift(Lift lift){

        liftHashMap.put(String.valueOf(lift.getLiftNo()),lift);
    }


    public String addPassenger(Passenger passenger) {
        if (passengerHashMap.containsKey((passenger.getPassengerId()))) {
            return "PASSENGER has been already there";
        } else
            passengerHashMap.put(passenger.getPassengerId(), passenger);
        return "Book has been added Successfully";
    }

    public void deletepassenger(int PassengerId) {
        for(Passenger passenger : passengerHashMap.values()){
            int passengerId= Integer.parseInt(passenger.getPassengerId());
            if(passengerId > 5){
                passengerHashMap.remove(passenger);
            }
        }
    }
}
