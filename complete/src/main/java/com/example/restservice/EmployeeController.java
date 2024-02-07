package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeManager employeeManager;

    // Constructor
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Endpoint to handle GET request for /employees
    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }
}
