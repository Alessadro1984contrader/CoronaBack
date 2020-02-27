package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.DTO.LoginDTO;
import it.contrader.DTO.UserDTO;
import it.contrader.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController extends AbstractController<UserDTO> {
	
	@Autowired
	private UserService userService;

@PostMapping(value = "/login")
public UserDTO login( @RequestBody LoginDTO loginDTO ) {
	return userService.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());

}
}
