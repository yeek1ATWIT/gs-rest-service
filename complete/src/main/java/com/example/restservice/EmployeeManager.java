package com.example.restservice;

public class EmployeeManager {
    private Employees employees;

    // Constructor
    public EmployeeManager() {
        this.employees = new Employees();
        initializeEmployees();
    }

    // Method to initialize example employees
    private void initializeEmployees() {
        Employee emp1 = new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer");
        Employee emp2 = new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Project Manager");
        Employee emp3 = new Employee("3", "Michael", "Johnson", "michael.johnson@example.com", "Business Analyst");

        employees.addEmployee(emp1);
        employees.addEmployee(emp2);
        employees.addEmployee(emp3);
    }

    // Getter method for Employees object
    public Employees getEmployees() {
        return employees;
    }
}
