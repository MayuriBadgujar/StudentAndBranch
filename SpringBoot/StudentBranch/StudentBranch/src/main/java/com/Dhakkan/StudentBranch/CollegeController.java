package com.Dhakkan.StudentBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {

    @Autowired
    CollegeService collegeService;


    //postman   :localhost:8080/students
    /*{
    "name":"Mayuri",
    "rollNo":1,
    "branchName":"CS",
    "marks":96
     }*/
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        collegeService.addStudent(student);
       // return ResponseEntity.status(HttpStatus.CREATED).build();
        return "Student added  successfully";
    }

     //postman    :localhost:8080/get_student_by_id?rollNo=1
    @GetMapping("/get_student_by_rollNo")
    public Student getStudent(@RequestParam int rollNo) {

        return collegeService.getStudent(rollNo);
    }


    //postman    :localhost:8080/branches
    /*{
    "branchName":"CS",
    "hodName":"j.n.chaoudhari",
    "contactNo":"1235666",
    "grant":4
    }*/
    @PostMapping("/branches")
    public String addBranch(@RequestBody Branch branch) {
        collegeService.addBranch(branch);
       return "branch Added";
    }

    @GetMapping("/get_branch_by_name")
    public Branch getBranch(@RequestParam String branchName){
      return  collegeService.getBranch(branchName);

    }

    @GetMapping("/get_all_student")
    public List<Student> getAllStudent(){
        return  collegeService.getAllStudent();
    }
}
