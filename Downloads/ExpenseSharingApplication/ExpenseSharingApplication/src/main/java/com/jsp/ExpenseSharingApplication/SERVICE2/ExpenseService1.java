package com.jsp.ExpenseSharingApplication.SERVICE2;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.ExpenseSharingApplication.DTO.User;
import com.jsp.ExpenseSharingApplication.DTO1.Expense;
import com.jsp.ExpenseSharingApplication.REPOSITORY.UserRepository;
import com.jsp.ExpenseSharingApplication.REPOSITORY1.ExpenseRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ExpenseService1 {
	
	 @Autowired
	    private ExpenseRepository expenseRepo;

	    @Autowired
	    private UserRepository userRepo;

	    public Map<String, Double> calculateBalance() {
	        List<Expense> expenses = expenseRepo.findAll();
	        Map<Integer, Double> balanceMap = new HashMap<>();

	        // Initialize all users with 0 balance
	        for (User user : userRepo.findAll()) {
	            balanceMap.put(user.getUserId(), 0.0);
	        }

	        // Calculate balances
	        for (Expense e : expenses) {
	            balanceMap.put(e.getPaidByUserId(),
	                balanceMap.get(e.getPaidByUserId()) + e.getAmount());
	            balanceMap.put(e.getOwedToUserId(),
	                balanceMap.get(e.getOwedToUserId()) - e.getAmount());
	        }

	        // Map userId to userName for better readability
	        Map<String, Double> result = new HashMap<>();
	        for (User u : userRepo.findAll()) {
	            result.put(u.getName(), balanceMap.get(u.getUserId()));
	        }

	        return result;
	    }
	}

