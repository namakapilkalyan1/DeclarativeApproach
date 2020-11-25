package com.techgeeknext.service;

import com.techgeeknext.modal.Notes;
import com.techgeeknext.modal.User;
import org.springframework.stereotype.Service;

@Service
public interface UserNotesLinkService {
    public String addNoteToSpecificUser(User user, Notes note) throws Exception;
}
