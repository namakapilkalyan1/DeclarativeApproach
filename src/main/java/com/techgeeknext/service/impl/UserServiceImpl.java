package com.techgeeknext.service.impl;

import com.techgeeknext.modal.User;
import com.techgeeknext.repository.UserRepository;
import com.techgeeknext.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;
    
    @Override
    @Transactional
    public User registerUser(User user) {
       return userRepository.save(user);
    }
}
