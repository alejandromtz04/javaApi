package com.example.api.User;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository userRepository;
    
    public void create (User user) throws Exception{
        try {
            boolean findEmail = userRepository.existByEmail(user.getEmail());

            if (findEmail) {
                
            }
        } catch (Exception ex) {
            throw new Exception("Internal server error: method create user from services" + ex);
        }
    }
}
