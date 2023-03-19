/*package com.backend.libarymanagementsystem.Controller;

public class StudentController {
}*/

package com.backend.libarymanagementsystem.Controller;


import com.backend.libarymanagementsystem.Entity.Student;
import com.backend.libarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

        return "Student has been added";
    }




}

