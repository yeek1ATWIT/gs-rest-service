package com.example.restservice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EmployeeValidatorTest {

    @Test
    public void testValidateEmployee_ValidEmployee() {
        // Test a valid employee
        Employee employee = new Employee("1", "John", "Doe", "john@example.com", "Engineer");
        assertTrue(EmployeeValidator.validateEmployee(employee));
    }

    @Test
    public void testValidateEmployee_InvalidEmail() {
        // Test an employee with an invalid email
        Employee employee = new Employee("2", "Jane", "Smith", "invalidemail", "Manager");
        assertFalse(EmployeeValidator.validateEmployee(employee));
    }

    @Test
    public void testValidateEmployee_MissingFirstName() {
        // Test an employee with a missing first name
        Employee employee = new Employee("3", null, "Johnson", "alice@example.com", "Developer");
        assertFalse(EmployeeValidator.validateEmployee(employee));
    }

    // Add more test cases for other validation scenarios as needed
}
