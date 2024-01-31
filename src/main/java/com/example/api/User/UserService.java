package com.example.api.User;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.api.Global.*;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository userRepository;
    
    public void create(User user) {
        try {
            userRepository.save(user);
            
        } catch (Exception ex) {
            throw new CustomException(
                "Internal server error: method create from services", 
                HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    public void modify(int id) {
        try {

        } catch (Exception ex) {
            throw new CustomException("Internal server error: method modify from service", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void findAll(User user) {
        try {
            userRepository.findAll();
            
        } catch (Exception ex) {
            throw new CustomException("Internal server error: method findAll from service", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public void findById(int id) {
        try {
            userRepository.findById(id).orElse(null);

        } catch (Exception ex) {
            throw new CustomException("Internal server error: method findById from service", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
