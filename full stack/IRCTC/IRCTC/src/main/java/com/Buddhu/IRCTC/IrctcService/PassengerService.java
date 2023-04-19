package com.Buddhu.IRCTC.IrctcService;

import com.Buddhu.IRCTC.Entity.Passenger;
import com.Buddhu.IRCTC.Entity.Train;
import com.Buddhu.IRCTC.Gender;
import com.Buddhu.IRCTC.IrctcRepository.PassengerRepository;
import com.Buddhu.IRCTC.IrctcRepository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    TrainRepository trainRepository;

    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public int noOfPassengerFromXtoY(String x, String y, Date date) {
        List<Passenger> passengerListOnDate=passengerRepository.findByDate(date);
        int countPassenger=0;
        for(Passenger p:passengerListOnDate){
            Train train=trainRepository.findById(p.getTrainId()).get();
            if(train.getSource().equals(x)  && train.getDestination().equals(y)){
                countPassenger++;
            }

        }
        return countPassenger;
    }

    public int findFemaleByAge(int x, int y, String destination) {
        int countfemale=0;
        List<Passenger> femalepassengerList=passengerRepository.findByGender(Gender.FEMALE);
        for(Passenger p:femalepassengerList){
            if(p.getAge()>=x && p.getAge()<y){
                Train train=trainRepository.findById(p.getTrainId()).get();
                if(train.getDestination().equals(destination));
                countfemale++;
            }
        }
        return countfemale;
    }
}
