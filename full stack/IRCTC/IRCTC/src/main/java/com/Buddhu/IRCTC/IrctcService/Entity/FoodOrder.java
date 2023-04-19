package com.Buddhu.IRCTC.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="/foodOrder")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private int tickedId;

    private int trainId;

    private int price;


}
