package com.example.restservice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class EmployeeControllerTest {

    @InjectMocks
    private EmployeeController employeeController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddEmployee() {
        // Test adding a new employee
        Employee employee = new Employee("123", "John", "Doe", "john@example.com", "Engineer");
        String result = employeeController.addEmployee(employee);
        assertEquals("Employee added successfully", result);
    }

    @Test
    public void testGetEmployees() {
        // Test querying employees
        List<Employee> employees = employeeController.getEmployees();
        assertNotNull(employees);
        assertEquals(3, employees.size()); // Assuming there are 3 employees initially
    }
}
