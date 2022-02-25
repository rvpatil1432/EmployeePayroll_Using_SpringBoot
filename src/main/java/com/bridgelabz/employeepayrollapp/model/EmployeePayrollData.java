package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;

public @Data class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;


    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.startDate = startDate;
        this.note = note;
        this.profilePic = profilePic;
    }
}
