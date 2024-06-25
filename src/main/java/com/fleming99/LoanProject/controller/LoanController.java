package com.fleming99.LoanProject.controller;

import com.fleming99.LoanProject.application.LoanServiceImpl;
import com.fleming99.LoanProject.core.dto.CustomerDTO;
import com.fleming99.LoanProject.core.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoanController {

    private final LoanServiceImpl loanService;

    @Autowired
    public LoanController(LoanServiceImpl loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public CustomerDTO requestLoans(@RequestBody Customer customer){
        return loanService.requestLoan(customer);
    }
}
