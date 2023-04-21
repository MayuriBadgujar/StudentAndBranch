package com.Dhakkan.StudentBranch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository collegeRepository;

    public void addStudent(Student student) {
        collegeRepository.addStudent(student);
    }

    public Student getStudent(int rollNo) {
        return collegeRepository.getStudent(rollNo);
    }

    public void addBranch(Branch branch) {
        collegeRepository.addBranch(branch);
    }

    public Branch getBranch(String branchName) {
   return     collegeRepository.getBranch(branchName);

    }

    public List<Student> getAllStudent() {
      return  collegeRepository.getAllStudent();
    }
}
