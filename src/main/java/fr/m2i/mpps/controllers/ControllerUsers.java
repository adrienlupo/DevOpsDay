package fr.m2i.mpps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.m2i.mpps.models.User;

@RestController
@RequestMapping("/api")
public class ControllerUsers {
	
	@GetMapping(path="/sayhello")
	public String SayHello() {
		User user1 = new User("Lupo", "Adrien");
		return "Hello " + user1.getNom() + " " + user1.getPrenom();
	}
	
}
