package de.gerritstapper.tutorium.userservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.gerritstapper.tutorium.userservice.model.User;
import de.gerritstapper.tutorium.userservice.repos.UserRepo;

@RestController
public class UserController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/addUser")
	public String addUser(@RequestParam("vorname") String vorname, 
						  @RequestParam("nachname") String nachname) {
		User user = new User();
		user.setVorname(vorname);
		user.setNachname(nachname);
		userRepo.save(user);
		return "User gespeichert";
	}
	
	@RequestMapping("/getAll")
	public List<User> getAll() {
		List<User> users = (List<User>) userRepo.findAll();
		return users;
	}
}
