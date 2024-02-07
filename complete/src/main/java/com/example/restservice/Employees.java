package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Constructor
    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    // Method to get employee list
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Method to add an employee to the list
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
