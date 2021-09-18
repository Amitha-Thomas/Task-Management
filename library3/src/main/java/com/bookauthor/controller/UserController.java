package com.bookauthor.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookauthor.entity.User;
import com.bookauthor.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

    
	private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }
    

    
    @PostMapping("/")
	public ResponseEntity<User> update(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}
    
    @PostMapping("/Completed")
	public String updatedefault(@RequestBody User user) {
		return "COMPLETED";
	}
    
    @DeleteMapping("/{id}")
	public ResponseEntity<User> delete(@PathVariable Integer id) {
    	userRepository.findById(id).ifPresent(userRepository::delete);
		return ResponseEntity.ok().build();
	}
    
    
	@PutMapping("/")
	public ResponseEntity<User> add(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}
}
    