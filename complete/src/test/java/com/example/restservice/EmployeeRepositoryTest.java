package com.example.restservice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryTest {

    @InjectMocks
    private EmployeeRepository employeeRepository;

    @Mock
    private List<Employee> mockEmployeeList;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockEmployeeList = new ArrayList<>();
        mockEmployeeList.add(new Employee("1", "John", "Doe", "john@example.com", "Engineer"));
        mockEmployeeList.add(new Employee("2", "Jane", "Smith", "jane@example.com", "Manager"));
        mockEmployeeList.add(new Employee("3", "Alice", "Johnson", "alice@example.com", "Developer"));
    }

    @Test
    public void testAddEmployee() {
        // Test adding a new employee
        Employee employee = new Employee("4", "Bob", "Brown", "bob@example.com", "Analyst");
        employeeRepository.addEmployee(employee);
        assertEquals(4, mockEmployeeList.size()); // Assuming there are 3 employees initially
    }

    @Test
    public void testGetEmployees() {
        // Test querying employees
        List<Employee> employees = employeeRepository.getEmployees();
        assertEquals(3, employees.size()); // Assuming there are 3 employees initially
    }
}
