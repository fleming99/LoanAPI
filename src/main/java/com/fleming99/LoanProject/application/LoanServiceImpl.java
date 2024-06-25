package com.fleming99.LoanProject.application;

import com.fleming99.LoanProject.core.entities.Customer;
import com.fleming99.LoanProject.core.entities.Loan;
import com.fleming99.LoanProject.core.enums.LoanTypes;
import com.fleming99.LoanProject.core.usecases.CustomerUseCase;
import com.fleming99.LoanProject.core.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanServiceImpl implements CustomerUseCase {

    @Override
    public CustomerDTO requestLoan(Customer customer) {

        List<Loan> loans = new ArrayList<>();

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setName(customer.getName());

        if(customer.getIncome() <= 3000){
            loans.add(new Loan(LoanTypes.PERSONAL, 4));
            loans.add(new Loan(LoanTypes.GUARANTEED, 3));
            customerDTO.setLoans(loans);
        } else if(customer.getIncome() <= 5000
                && customer.getAge() <= 30
                && customer.getLocation().equalsIgnoreCase("sp")){
            loans.add(new Loan(LoanTypes.PERSONAL, 4));
            loans.add(new Loan(LoanTypes.GUARANTEED, 3));
            customerDTO.setLoans(loans);
        } else{
            loans.add(new Loan(LoanTypes.CONSIGNMENT, 2));
            customerDTO.setLoans(loans);
        }

        return customerDTO;
    }

}
