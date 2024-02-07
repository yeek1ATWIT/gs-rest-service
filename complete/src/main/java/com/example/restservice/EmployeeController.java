package com.example.restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeManager employeeManager;

    // Constructor
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Endpoint to handle POST request for adding a new employee
    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        // Add the new employee to the list
        employeeManager.addEmployee(employee);
        return "Employee added successfully";
    }
}
