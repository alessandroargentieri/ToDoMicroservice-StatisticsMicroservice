package com.quicktutorialz.learnmicroservices.FirstToDos;

import com.quicktutorialz.learnmicroservices.FirstToDos.daos.ToDoDao;
import com.quicktutorialz.learnmicroservices.FirstToDos.daos.UserDao;
import com.quicktutorialz.learnmicroservices.FirstToDos.entities.ToDo;
import com.quicktutorialz.learnmicroservices.FirstToDos.entities.User;
import com.quicktutorialz.learnmicroservices.FirstToDos.utilities.EncryptionUtils;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Log 								//lombok
@SpringBootApplication
public class FirstToDosApplication implements CommandLineRunner{

	//beans injection

	@Autowired
	UserDao userDao;

	@Autowired
	ToDoDao toDoDao;

	@Autowired
	EncryptionUtils encryptionUtils;


	public static void main(String[] args) {
		SpringApplication.run(FirstToDosApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {

		//all stuff here will be executed at the beginning, before microservice starts listening
		log.info("let's fill H2 in-memory database");

		/* let's fill table 'users' */

		String encryptedPwd;

		encryptedPwd = encryptionUtils.encrypt("Hello");
		userDao.save(new User("alex@quicktutorialz.com", "Alessandro Argentieri", encryptedPwd));

		encryptedPwd = encryptionUtils.encrypt("MyPwd");
		userDao.save(new User("franz@quicktutorialz.com", "Franz Leroy", encryptedPwd));

		encryptedPwd = encryptionUtils.encrypt("Belle");
		userDao.save(new User("annabelle@quicktutorialz.com", "Annabelle Sorah", encryptedPwd));

		/* let's fill table 'todos' */

		toDoDao.save(new ToDo(1, "Learn Microservices", new Date(), "high", "alex@quicktutorialz.com"));
		toDoDao.save(new ToDo(null, "Learn SpringBoot", null, "low", "alex@quicktutorialz.com"));

		toDoDao.save(new ToDo(3, "Feed animals", new Date(), "high", "franz@quicktutorialz.com"));
		toDoDao.save(new ToDo(null, "Go to take Jim", null, "low", "franz@quicktutorialz.com"));

		toDoDao.save(new ToDo(5, "Buy new car", new Date(), "low", "annabelle@quicktutorialz.com"));
		toDoDao.save(new ToDo(null, "Go to the gym", null, "low", "annabelle@quicktutorialz.com"));


		log.info("we've finished our work");

	}
}
