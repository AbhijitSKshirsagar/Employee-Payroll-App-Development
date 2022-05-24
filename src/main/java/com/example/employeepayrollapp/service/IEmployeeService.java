package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.entity.EmployeePayrollData;

import java.util.List;

public class IEmployeeService{
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int id);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO);
    EmployeePayrollData updateEmployeePayrollData(int id,EmployeePayrolDTO employeePayrolDTO);
    void deleteEmployeePayrollData(int id);
}


