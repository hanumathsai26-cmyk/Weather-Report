package ExpenseSharingApplication.CONTROLLER1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.jsp.ExpenseSharingApplication.DTO1.Expense;
import com.jsp.ExpenseSharingApplication.REPOSITORY1.ExpenseRepository;

import jakarta.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/expense")
public class ExpenseController {
	
	 @Autowired
	    private ExpenseRepository expenseRepo;

	    // Add new expense
	    @PostMapping
	    public Expense addExpense(@RequestBody Expense expense) {
	        return expenseRepo.save(expense);
	    }

	    // Get all expenses
	    @GetMapping
	    public List<Expense> getAllExpenses() {
	        return expenseRepo.findAll();
	    }
}

