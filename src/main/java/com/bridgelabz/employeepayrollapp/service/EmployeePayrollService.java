package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = new ArrayList<>();
        empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",20000)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",20000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {

    }
}

