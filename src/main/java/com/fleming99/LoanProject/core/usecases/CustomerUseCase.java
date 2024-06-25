package com.fleming99.LoanProject.core.usecases;

import com.fleming99.LoanProject.core.entities.Customer;
import com.fleming99.LoanProject.core.dto.CustomerDTO;

public interface CustomerUseCase {

    CustomerDTO requestLoan(Customer customer);
}
