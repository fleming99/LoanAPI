package com.fleming99.LoanProject.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String name;

    private int age;

    @CPF
    private String cpf;

    private double income;

    private String location;
}
