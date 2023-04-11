package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.response.UserResponse;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService extends BaseService{
    @Autowired
    private UserRepository userRepository;
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public UserResponse getUserInfor(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found user"));
        UserResponse userResponse = mapper.map(user, UserResponse.class);
        return userResponse;
    }

}
