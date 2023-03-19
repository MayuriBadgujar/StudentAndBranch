package com.dreamCourse.jpabasic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
         userRepository.save(user);
        return "user added";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }

}
