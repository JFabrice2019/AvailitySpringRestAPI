package com.availityBackend.demo.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.availityBackend.demo.model.User;
import com.availityBackend.demo.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/users")
	public Set<User> getAllUsers() {
	    return userService.getAllUsers();
	}
	
    @PostMapping("/saveuser")
    void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> retrieveUser(@PathVariable long userId){
		Optional<User> user = Optional.empty();
		try {
			user = userService.getUserById(userId);
		}
		catch(Exception e) {
			
		}
	    return ResponseEntity.ok().body(user);

	}
	
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
         @RequestBody User userDetails){
        return ResponseEntity.ok(userService.updateUser(userId,userDetails));
    	
    }
    

    @PutMapping("/deleteUser/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Long userId){
    	return ResponseEntity.ok(userService.deleteUser(userId));    	
    }
    

    @PutMapping("/activateUser/{id}")
    public ResponseEntity<User> activateUser(@PathVariable(value = "id") Long userId){
    	return ResponseEntity.ok(userService.activateUser(userId));    	
    }

}
