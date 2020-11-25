package com.techgeeknext;

import com.techgeeknext.modal.Notes;
import com.techgeeknext.modal.User;
import com.techgeeknext.service.UserNotesLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaAuditing
@RestController
public class TransactionManagementApplication {

	@Autowired
	private UserNotesLinkService userNotesService;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(TransactionManagementApplication.class, args);
		UserNotesLinkService userNotesLinkService = context.getBean(UserNotesLinkService.class);

		/* TEST DATA */
			
		int i;
		for(i=1;i<=3;i++)
		{
			User user = new User();
			Notes note = new Notes();
			try {
			user.setUserMail("test"+i+"@gmail.com");
			user.setUserPass("12345678jh"+i);

			//create new note
			
			note.setTitle("Test Note"+i);
			note.setMessage("Test Message"+i);

			//link above new user with above note
			userNotesLinkService.addNoteToSpecificUser(user, note);
			}
			catch(Exception e)
			{
				System.out.println("Exception was raised for the user "+user.getUserId());
				continue;
			}

		}


	}
}