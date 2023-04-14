package com.SpringBoot.GymManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymService {
    @Autowired
    GymRepository gymRepository;

    public void addGyms(Gym gym) {
        gymRepository.addGyms(gym);
    }

    public void addMember(Member member) {
        gymRepository.addMember(member);
    }

    public void addTrainer(Trainer trainer) {
        gymRepository.addTrainer(trainer);
    }
}
