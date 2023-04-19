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
@Table(name="/train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private int trainId;

    private String source;

    private String destination;

}
