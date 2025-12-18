package com.jsp.ExpenseSharingApplication.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.ExpenseSharingApplication.DTO.User;
import com.jsp.ExpenseSharingApplication.REPOSITORY.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}
}

