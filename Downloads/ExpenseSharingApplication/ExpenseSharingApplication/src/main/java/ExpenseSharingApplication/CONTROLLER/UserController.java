package ExpenseSharingApplication.CONTROLLER;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ExpenseSharingApplication.DTO.User;
import com.jsp.ExpenseSharingApplication.REPOSITORY.UserRepository;

import jakarta.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/user")
public class UserController {
	
	    @Autowired
	    private UserRepository userRepo;

	    // Add new user
	    @PostMapping
	    public User addUser(@RequestBody User user) {
	        return userRepo.save(user);
	    }

	    // Get all users
	    @GetMapping
	    public List<User> getAllUsers() {
	        return userRepo.findAll();
	    }
	    @GetMapping("/{id}")
	    public User getUserById(@PathVariable int id) {
	        return userRepo.findById(id).orElse(null);
	    }
	 
}

