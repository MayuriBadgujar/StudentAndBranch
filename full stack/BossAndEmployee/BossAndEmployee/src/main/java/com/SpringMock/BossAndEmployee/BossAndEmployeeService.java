package com.SpringMock.BossAndEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class BossAndEmployeeService {
    @Autowired
    BossAndEmployeeRepository bossAndEmployeeRepository;

    public void addBoss( Boss boss){
        bossAndEmployeeRepository.addBoss(boss);

    }
    public void addEmployee( Employee employee){
        bossAndEmployeeRepository.addEmployee(employee);

    }
    public List<Employee> getEmployee(Integer age, Float rating){
        List<Employee> employeeList= bossAndEmployeeRepository.getEmployee(age,rating);
        return employeeList;
    }

  public void updateBoss(float rating,int x){
          bossAndEmployeeRepository.updateBoss(rating,x);
    }
    public int countEmployee(int x ){
        return bossAndEmployeeRepository.countEmployee(x);
    }
}
