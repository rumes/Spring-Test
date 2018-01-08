package com.rumes.springrestapi.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
	
	/*@Autowired 
	private UserService userService;
	
	@RequestMapping("/users") 
	public List<Users> allUsers(){
		
		return this.userService.allUsers();
		
	}
	
	@RequestMapping("/users/{id}")
	public Users user(@PathVariable String id) {
		
		return this.userService.user(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody Users user) {
		
		this.userService.addUser(user);
		
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users")
	public void updateUser(@RequestBody Users user) {
		
		this.userService.updateUser(user);
		
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
	public void updateUser(@PathVariable String id) {
		
		this.userService.deleteUser(id);
		
		
	}*/

}
