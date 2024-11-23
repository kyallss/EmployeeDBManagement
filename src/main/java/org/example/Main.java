package org.example;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // adding new employee
        Employee newEmployee = new Employee("Kyial Asykpaeva", "Analyst", 48000, new java.util.Date());
        employeeData.createEmployee(newEmployee);

        // getting employee by id
        Employee employee = employeeData.getEmployeeById(1);
        System.out.println(employee);

        // getting all employees
        System.out.println("All employees:");
        employeeData.getAllEmployees().forEach(System.out::println);

        // updating employee
        if (employee != null) {
            employee.setPosition("Middle Analyst");
            employeeData.updateEmployee(employee);
        }

        // deleting employee
        employeeData.deleteEmployee(1);
    }
}
