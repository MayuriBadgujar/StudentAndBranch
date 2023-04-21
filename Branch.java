package com.Dhakkan.StudentBranch;

public class Branch {
    private String branchName;
    private String hodName;
    private String contactNo;
    private int grant;

    public Branch() {
    }

    public Branch(String branchName, String hodName, String contactNo, int grant) {
        this.branchName = branchName;
        this.hodName = hodName;
        this.contactNo = contactNo;
        this.grant = grant;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        this.grant = grant;
    }
}
