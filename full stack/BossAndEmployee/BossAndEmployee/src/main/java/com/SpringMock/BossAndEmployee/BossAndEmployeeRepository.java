package com.SpringMock.BossAndEmployee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BossAndEmployeeRepository {

    HashMap<Integer,Boss> bossHashMap=new HashMap<>();
    HashMap<Integer,Employee> employeeHashMap=new HashMap<>();

    public void addBoss(Boss boss){
        bossHashMap.put(Integer.valueOf(boss.getId()),boss);
    }

    public void addEmployee(Employee employee){
        employeeHashMap.put(Integer.valueOf(employee.getId()),employee);
    }

    // Get employees who are under a given age and have rating greater than x.
    public List<Employee> getEmployee(int age,Float rating){
       List<Employee> employeeList=new ArrayList<>();
        for(Employee employee:employeeHashMap.values()){
            if(employee.getAge()< age && employee.getRating()>rating){

                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    //update all the boss salary by x whose rating is > y.
    public void updateBoss(float rating, int x){
        List<Boss> bossList=new ArrayList<>();
        for(Boss boss:bossHashMap.values()){
           if(boss.getRating()>rating ){
             boss.setSalary(boss.getSalary()+x);
               bossHashMap.put(Integer.valueOf(boss.getId()),boss);
           }
       }

    }
  //  Find out all count of the employees, who’s bossRating and employee rating > x.
    public int  countEmployee(int x) {
        int employeeCount=0;
        for(Employee employee : employeeHashMap.values()){
           Boss boss =  employee.getBoss();
            float rating = boss.getRating();
           if(employee.getRating()>x ) {
               if (boss.getRating() > x){
                   employeeCount++;
           }
           }

        }
        return employeeCount;
    }
}
