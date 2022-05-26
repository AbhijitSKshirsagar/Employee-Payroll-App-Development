package com.example.employeepayrollapp.repository;

import com.example.employeepayrollapp.entity.EmployeePayrolData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrolData,Integer> {
    @Query(value = "select * from employee_data, employee_department where emp_id = id and department = :department", nativeQuery = true)
    List<EmployeePayrolData> findEmployeesByDepartment(String department);
}
