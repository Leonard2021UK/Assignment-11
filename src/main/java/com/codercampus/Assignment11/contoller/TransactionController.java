package com.codercampus.Assignment11.contoller;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class TransactionController {

    TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(path = "/transactions")
    public String getTransactions(ModelMap model){
        List<Transaction> transactions = this.transactionService.getAllTransactions();
        Collections.sort(transactions);
        model.put("transactions", transactions);
        return "transactions";
    }

    @GetMapping(path = "/transactions/{transactionId}")
    public String getById(ModelMap model, @PathVariable Long transactionId){
        Transaction transaction = this.transactionService.getTransactionById(transactionId);
        model.put("transaction",transaction);
        return "transaction";
    }
}
