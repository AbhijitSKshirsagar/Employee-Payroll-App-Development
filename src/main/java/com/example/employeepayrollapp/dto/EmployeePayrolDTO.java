package com.example.employeepayrollapp.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class EmployeePayrolDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname is invalid")
    private String fName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee lastname is invalid")
    private String lName;
    @NotEmpty(message = "Company name should not be empty")
    private String company;
    private String roll;
    @Min(value = 500, message = "Min salary should be more than 500")
    private int salary;

}
