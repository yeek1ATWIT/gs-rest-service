package com.example.restservice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddEmployee() {
        // Test adding a new employee
        Employee employee = new Employee("4", "Bob", "Brown", "bob@example.com", "Analyst");
        employeeService.addEmployee(employee);
        // Verify that the repository's addEmployee method was called with the correct employee
        verify(employeeRepository, times(1)).addEmployee(employee);
    }

    @Test
    public void testGetEmployees() {
        // Mock the behavior of the employee repository
        List<Employee> mockEmployees = new ArrayList<>();
        mockEmployees.add(new Employee("1", "John", "Doe", "john@example.com", "Engineer"));
        mockEmployees.add(new Employee("2", "Jane", "Smith", "jane@example.com", "Manager"));
        mockEmployees.add(new Employee("3", "Alice", "Johnson", "alice@example.com", "Developer"));
        when(employeeRepository.getEmployees()).thenReturn(mockEmployees);

        // Test querying employees from the service
        List<Employee> employees = employeeService.getEmployees();
        // Verify that the service returns the correct list of employees
        assertEquals(mockEmployees, employees);
    }
}
