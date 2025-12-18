package ExpenseSharingApplication.CONTROLLER2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.jsp.ExpenseSharingApplication.DTO2.Balance;
import com.jsp.ExpenseSharingApplication.REPOSITORY2.BalanceRepository;
import com.jsp.ExpenseSharingApplication.SERVICE2.ExpenseService1;

import jakarta.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/balance")
public class BalanceController {
	
	@Autowired
    private BalanceRepository balanceRepo;

    // Add new balance
    @PostMapping
    public Balance addBalance(@RequestBody Balance balance) {
        return balanceRepo.save(balance);
    }

    // Get all balances
    @GetMapping
    public List<Balance> getAllBalances() {
        return balanceRepo.findAll();
    }

    // Get balance for a specific user
    @GetMapping("/{userId}")
    public Balance getBalanceByUser(@PathVariable int userId) {
        return balanceRepo.findbyUserId(userId); // assuming method exists in repository
    }
}

