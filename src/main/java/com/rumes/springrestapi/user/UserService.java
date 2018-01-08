package com.rumes.springrestapi.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class UserService {
	
	@Autowired 
	private UserRepository userRepository;
	
	public List<User> allUsers(){
		
		List<User> users = new ArrayList<>();
		
		this.userRepository.findAll()
		.forEach(users::add);
		
		return users;
		
	}
	
	public User user(String id) {
		
		return this.userRepository.findOne(id);
		
	}
	
	public void addUser(User user) {
		
		this.userRepository.save(user);
		
	}
	
	public void updateUser(User user) {
		
		this.userRepository.save(user);
		
	}
	
	public void deleteUser(String id) {
		
		this.userRepository.delete(id);
		
	}
}
