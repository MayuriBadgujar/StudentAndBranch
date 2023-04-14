package com.SpringBoot.GymManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class GymRepository {
    HashMap<String,Gym> gymHashMap=new HashMap<>();
    HashMap<String, Trainer> trainerHashMap=new HashMap<>();
    HashMap<String ,Member> memberHashMap=new HashMap<>();

    public void addGyms(Gym gym) {
        gymHashMap.put(String.valueOf(gym.getGymId()),gym);
    }

    public void addMember(Member member) {
        memberHashMap.put(String.valueOf(member.getMemberId()),member);
    }

    public void addTrainer(Trainer trainer) {

        trainerHashMap.put(String.valueOf(trainer.getTrainerId()),trainer);
    }
}
