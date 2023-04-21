package com.Dhakkan.StudentBranch;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class CollegeRepository {

    HashMap<Integer, Student> students = new HashMap<>();
   HashMap <String, Branch> branches = new HashMap<>();

    public void addStudent(Student student) {
        // check if student already exists
        if (students.containsKey(student.getRollNo())) {
            throw new IllegalArgumentException("Student with roll number " + student.getRollNo() + " already exists");
        }

        // check if marks are valid
        if (student.getMarks() < 0 || student.getMarks() > 100) {
            throw new IllegalArgumentException("Invalid marks: " + student.getMarks());
        }

        // check if student passed
        if (student.getMarks() < 40) {
            throw new IllegalArgumentException("Student with roll number " + student.getRollNo() + " failed");
        }

        // add student
        students.put(student.getRollNo(), student);
    }

    public Student getStudent(int rollNo) {
        if (!students.containsKey(rollNo)) {
            throw new IllegalArgumentException("Student with roll number " + rollNo + " does not exist");
        }

        return students.get(rollNo);
    }

    public void addBranch(Branch branch) {
        if(branches.containsKey(branch.getBranchName())){
            throw new IllegalArgumentException("Branch " + branch.getBranchName() + " already exists");
        }
        branches.put(branch.getBranchName(),branch);
    }

    public Branch getBranch(String branchName) {
        if (!branches.containsKey(branchName)) {
            throw new IllegalArgumentException("Branch " + branchName + " does not exist");
        }

       return branches.get(branchName);
    }

    public List<Student> getAllStudent() {
        return new ArrayList<>(students.values());
    }
}
