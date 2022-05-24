package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeePayrolDTO;
import com.example.employeepayrollapp.dto.ResponseDTO;
import com.example.employeepayrollapp.entity.EmployeePayrollData;
import com.example.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/web")
public class EmployeePayrollController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        List<EmployeePayrollData> empData=iEmployeeService.getEmployeePayrollData();
        ResponseDTO responseDTO=new ResponseDTO("Get Call Successfull",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int id){
        EmployeePayrollData employeePayrollData=iEmployeeService.getEmployeePayrollDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("Get call for ID Success",employeePayrollData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrollData employeePayrollData=iEmployeeService.createEmployeePayrollData(employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("created employee payroll succesfully",employeePayrollData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int id,@RequestBody EmployeePayrolDTO employeePayrolDTO){
        EmployeePayrollData employeePayrollData=iEmployeeService.updateEmployeePayrollData(id,employeePayrolDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated employee payroll data succesfully",employeePayrollData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable int id){
        iEmployeeService.deleteEmployeePayrollData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}
