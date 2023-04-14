package com.SpringBoot.GymManagement;

import java.util.List;

public class Trainer {
    private int trainerId;

    private List<Member> memberList;

    private List<Gym> gymList;

    public Trainer() {
    }

    public Trainer(int trainerId, List<Member> memberList, List<Gym> gymList) {
        this.trainerId = trainerId;
        this.memberList = memberList;
        this.gymList = gymList;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Gym> getGymList() {
        return gymList;
    }

    public void setGymList(List<Gym> gymList) {
        this.gymList = gymList;
    }
}
