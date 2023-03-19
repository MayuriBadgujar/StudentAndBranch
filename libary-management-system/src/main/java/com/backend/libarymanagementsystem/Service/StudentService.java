/*package com.backend.libarymanagementsystem.Service;

public class StudentService {
}*/
/*package com.backend.libarymanagementsystem.Service;


import com.backend.libarymanagementsystem.Entity.LibraryCard;
import com.backend.libarymanagementsystem.Entity.Student;
import com.backend.libarymanagementsystem.Enum.CardStatus;
import com.backend.libarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){

        //set the value of card
        LibraryCard card=new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        card.setStudent(student);

        //set the card attribute   in student

        student.setCard(card);
        studentRepository.save(student);


    }
}

*/
package com.backend.libarymanagementsystem.Service;

import com.backend.libarymanagementsystem.Entity.LibraryCard;
import com.backend.libarymanagementsystem.Entity.Student;
import com.backend.libarymanagementsystem.Enum.CardStatus;
import com.backend.libarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){

        // set the value of card
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        card.setStudent(student);

        // set the card attroubte in student
        student.setCard(card);


        studentRepository.save(student);
    }

}