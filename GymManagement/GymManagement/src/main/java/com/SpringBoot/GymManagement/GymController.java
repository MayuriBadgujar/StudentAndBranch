package com.SpringBoot.GymManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
public class GymController {
    @Autowired

    GymService gymService;

    @PostMapping("/addGym")
    public String addGyms(@RequestBody Gym gym){
        gymService.addGyms(gym);
        return "Gym Added Successfully";
    }
    @PostMapping("/addMember")
    public String addMember(@RequestBody Member member){
        gymService.addMember(member);
        return "Member Added Successfully";
    }
    @PostMapping("/addTrainer")
    public String addTrainer(@RequestBody Trainer trainer){
        gymService.addTrainer(trainer);
        return "Trainer Added Successfully";
    }
}
