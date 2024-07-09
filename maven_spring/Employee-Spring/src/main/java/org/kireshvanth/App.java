package org.kireshvanth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // Create and save a new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setDepartment("Engineering");
        employeeService.saveEmployee(employee);
        System.out.println("Employee saved: " + employee);

        // Fetch and display all employees
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("All employees:");
        employees.forEach(System.out::println);

        // Fetch and display a single employee by ID
        Employee fetchedEmployee = employeeService.getEmployeeById(1);
        System.out.println("Fetched employee by ID: " + fetchedEmployee);

        // Update an employee
        fetchedEmployee.setDepartment("HR");
        employeeService.updateEmployee(fetchedEmployee);
        System.out.println("Updated employee: " + fetchedEmployee);

        // Delete an employee
        employeeService.deleteEmployee(1);
        System.out.println("Deleted employee with ID 1");

        // Display all employees after deletion
        employees = employeeService.getAllEmployees();
        System.out.println("All employees after deletion:");
        employees.forEach(System.out::println);
    }
}

