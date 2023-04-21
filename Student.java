package com.Dhakkan.StudentBranch;

public class Student {
    private String name;
    private int rollNo;
    private String branchName;
    private int marks;

    public Student() {
    }

    public Student(String name, int rollNo, String branchName, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.branchName = branchName;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
