package com.techgeeknext.service;

import com.techgeeknext.modal.NoteBase;
import com.techgeeknext.modal.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User registerUser(User user);
}