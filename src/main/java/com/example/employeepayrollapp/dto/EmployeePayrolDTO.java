package com.example.employeepayrollapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class EmployeePayrolDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname is invalid")
    public String fName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee lastname is invalid")
    public String lName;
    @NotEmpty(message = "Company name should not be empty")
    public String company;
    public String roll;
    @Min(value = 500, message = "Min salary should be more than 500")
    public int salary;

}
