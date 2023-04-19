package com.Buddhu.IRCTC.Entity;

import com.Buddhu.IRCTC.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="/passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int tickedId;

    private int trainId;


    private Date date;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
