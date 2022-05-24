package com.example.employeepayrollapp.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class EmployeePayrolDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname cannot be empty and null")
    private String fName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Employee firstname cannot be empty and null")
    private String lName;
    @NotEmpty(message = "Company name should not be empty")
    private String company;
    private String roll;
    @Min(value = 500, message = "Min salary should be more than 500")
    private int salary;

    private String fName;
    private String lName;
    private String company;
    private String roll;
    private int salary;

    public EmployeePayrolDTO(String fName, String lName, String company, String roll, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.company = company;
        this.roll = roll;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrolDTO{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", company='" + company + '\'' +
                ", roll='" + roll + '\'' +
                ", salary=" + salary +
                '}';
    }
}
