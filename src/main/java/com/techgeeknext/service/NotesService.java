package com.techgeeknext.service;
import java.util.List;
import javax.validation.Valid;
import com.techgeeknext.modal.NoteBase;
import com.techgeeknext.modal.Notes;
import com.techgeeknext.modal.User;
import org.springframework.stereotype.Service;

@Service
public interface NotesService {
	//public User registerUser(User user);
	public String addNote(Notes note) throws Exception; 
	
}