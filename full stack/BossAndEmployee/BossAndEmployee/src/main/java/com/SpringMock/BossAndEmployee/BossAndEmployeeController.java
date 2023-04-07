package com.SpringMock.BossAndEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BossAndEmployeeController {

    @Autowired
    BossAndEmployeeService bossAndEmployeeService;
    @PostMapping("/add_boss")
    public String addBoss(@RequestBody Boss boss){
        bossAndEmployeeService.addBoss(boss);
        return "Boss Added";
    }
    @PostMapping("/add_employee")
    public String addEmployee(@RequestBody Employee employee){
        bossAndEmployeeService.addEmployee(employee);
        return "Employee Added";
    }
    // Get employees who are under a given age and have rating greater than x.
    @GetMapping("/get_employee")
    public List<Employee> getEmployee(@RequestParam("age") Integer age, @RequestParam("rating") Float rating){
        List<Employee> employeeList= bossAndEmployeeService.getEmployee(age,rating);
        return employeeList;
    }
    //update all the boss salary by x whose rating is > y.
    @PutMapping("/update_boss_salary")
    public String updateBoss(float rating,int x){
        bossAndEmployeeService.updateBoss(rating,x);
        return "book updated";
    }
    //GET: Find out all count of the employees, who’s bossRating and employee rating > x.
    @GetMapping("/count_employee")
    public int countEmployee(int x ){
        return bossAndEmployeeService.countEmployee(x);
    }


}
