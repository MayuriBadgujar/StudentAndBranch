package com.Spring2.Project;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public  class StudentRepository  {

    HashMap<String, Student> studentHashMap=new HashMap<>();

    public void addStudent(Student student){
        studentHashMap.put(student.getName(),student);
    }
}
