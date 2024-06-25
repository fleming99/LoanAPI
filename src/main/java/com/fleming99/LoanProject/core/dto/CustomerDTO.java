package com.fleming99.LoanProject.core.dto;

import com.fleming99.LoanProject.core.entities.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private String name;

    private List<Loan> loans;
}
