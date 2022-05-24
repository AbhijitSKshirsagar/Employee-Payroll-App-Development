package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.entity.EmployeePayrollData;
import com.example.employeepayrollapp.entity.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeeService{

    private List<EmployeePayrollData> employeePayrollDataList=new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id) {
        return employeePayrollDataList.get(id-1);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrollData employeePayrolData=new EmployeePayrollData(employeePayrollDataList.size()+1,employeePayrolDTO);
        employeePayrollDataList.add(employeePayrolData);
        return employeePayrolData;
    }

    public EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrolDTO employeePayrolDTO) {
        EmployeePayrollData employeePayrolData=this.getEmployeePayrollDataById(id);
        employeePayrolData.setfName(employeePayrolDTO.getfName());
        employeePayrolData.setlName(employeePayrolDTO.getlName());
        employeePayrolData.setCompany(employeePayrolDTO.getCompany());
        employeePayrolData.setRoll(employeePayrolDTO.getRoll());
        employeePayrolData.setSalary(employeePayrolDTO.getSalary());
        employeePayrollDataList.set(id-1,employeePayrolData);
        return employeePayrolData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        employeePayrollDataList.remove(id-1);
    }
}
