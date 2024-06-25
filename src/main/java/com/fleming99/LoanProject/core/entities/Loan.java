package com.fleming99.LoanProject.core.entities;

import com.fleming99.LoanProject.core.enums.LoanTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    private LoanTypes loanTypes;

    private int interestRate;

}
