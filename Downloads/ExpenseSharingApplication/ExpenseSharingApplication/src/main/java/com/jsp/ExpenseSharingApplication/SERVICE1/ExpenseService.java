package com.jsp.ExpenseSharingApplication.SERVICE1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.ExpenseSharingApplication.DTO1.Expense;
import com.jsp.ExpenseSharingApplication.DTO2.Balance;
import com.jsp.ExpenseSharingApplication.REPOSITORY1.ExpenseRepository;
import com.jsp.ExpenseSharingApplication.REPOSITORY2.BalanceRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;

	@Autowired
	private BalanceRepository balanceRepository;

	public Expense addExpense(Expense expense) {
		expenseRepository.save(expense);

		// Simple Equal Split Logic (Example)
		Balance balance = new Balance();
		balance.setUserId(2);                 // user who owes
		balance.setOwesToUserId(expense.getPaidByUserId());
		balance.setAmount(expense.getAmount() / 2);

		balanceRepository.save(balance);

		return expense;
	}
}


