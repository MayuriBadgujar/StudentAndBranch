package com.SpringBoot.GymManagement;

import java.util.List;

public class Member {

    private int memberId;

    private List<Trainer> trainerList;

    public Member() {
    }

    public Member(int memberId, List<Trainer> trainerList) {
        this.memberId = memberId;
        this.trainerList = trainerList;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }
}
