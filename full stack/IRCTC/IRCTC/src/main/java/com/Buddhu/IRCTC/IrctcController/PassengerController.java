package com.Buddhu.IRCTC.IrctcController;

import com.Buddhu.IRCTC.Entity.Passenger;
import com.Buddhu.IRCTC.IrctcService.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @PostMapping("/add")
        public String addPassenger(@RequestBody Passenger passenger){
        passengerService.addPassenger(passenger);
        return "Passenger added Successfully";
        }

   // GET API - Find the Number of passengers travelling from City X and City Y on Date D
    @GetMapping("/noOfPassengerFromXtoY")
    public int noOfPassengerFromXtoY(@RequestParam String x,@RequestParam String y,@RequestParam Date date){
        return passengerService.noOfPassengerFromXtoY(x,y,date);
    }
    //GET API - Find total No of female passengers of age between X and Y(X < = Y) who
    //ended their destination at city C.
    @GetMapping("/findFemaleByAge")
    public int findFemaleByAge(@RequestParam int x,@RequestParam int y,@RequestParam String destination){
        return passengerService.findFemaleByAge(x,y,destination);
    }
}
