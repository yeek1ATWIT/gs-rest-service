package com.example.restservice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class EmployeeManagerTest {

    @InjectMocks
    private EmployeeManager employeeManager;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddEmployee() {
        // Test adding a new employee
        Employee employee = new Employee("123", "John", "Doe", "john@example.com", "Engineer");
        employeeManager.addEmployee(employee);
        assertEquals(1, employeeManager.getEmployees().size());
    }

    @Test
    public void testGetEmployees() {
        // Test querying employees
        List<Employee> employees = employeeManager.getEmployees();
        assertNotNull(employees);
        assertEquals(3, employees.size()); // Assuming there are 3 employees initially
    }
}
