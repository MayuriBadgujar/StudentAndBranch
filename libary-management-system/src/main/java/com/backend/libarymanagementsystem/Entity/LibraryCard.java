/*package com.backend.libarymanagementsystem.Entity;

public class LibraryCard {
}
*/
package com.backend.libarymanagementsystem.Entity;

import com.backend.libarymanagementsystem.Enum.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;

    private String validTill;

    @Enumerated(EnumType.STRING)
    private  CardStatus status;

    @OneToOne
    @JoinColumn
    Student student;


}
