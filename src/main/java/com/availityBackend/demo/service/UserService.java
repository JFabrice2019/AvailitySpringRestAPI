package com.availityBackend.demo.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.availityBackend.demo.model.User;
import com.availityBackend.demo.model.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
    public Set<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        Set<User> setUsers = new HashSet<>(users);
        return setUsers;
    }  
    
    public void saveUser(User user) {
        this.userRepository.save(user);
    }
 
 

    public Optional<User> getUserById(long userId) {
        return userRepository.findById(userId) ;
    }


    public User updateUser(long userId, User updateUser)  {
    	User user = userRepository.getById(userId);
    	user.setFirstname(updateUser.getFirstname());
    	user.setLastname(updateUser.getLastname());
    	user.setNpiNumber(updateUser.getNpiNumber());
    	user.setPhonenumber(updateUser.getPhonenumber());
    	user.setEmail(updateUser.getEmail());
    	user.setLine1(updateUser.getLine1());
    	user.setCity(updateUser.getCity());
    	user.setState(updateUser.getState());
    	user.setZipcode(updateUser.getZipcode());
        final User updatedUser = userRepository.save(user);
        return updatedUser;
    }    


    public User deleteUser(long userId)  {
    	User user = userRepository.getById(userId);
    	user.setDeleted(0);
        final User updatedUser = userRepository.save(user);
        return updatedUser;   
    }    


    public User activateUser(long userId)  {
    	User user = userRepository.getById(userId);
    	user.setDeleted(1);
        final User updatedUser = userRepository.save(user);
        return updatedUser;   
    }  



}
