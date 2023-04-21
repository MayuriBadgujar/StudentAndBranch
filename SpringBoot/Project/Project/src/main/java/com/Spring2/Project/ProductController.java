package com.Spring2.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student Added";
    }
    @GetMapping()

}
