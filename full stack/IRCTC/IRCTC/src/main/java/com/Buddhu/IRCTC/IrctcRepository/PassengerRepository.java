package com.Buddhu.IRCTC.IrctcRepository;

import com.Buddhu.IRCTC.Entity.Passenger;
import com.Buddhu.IRCTC.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
    List<Passenger> findByDate(Date date);

    List<Passenger> findByGender(Gender female);
}
