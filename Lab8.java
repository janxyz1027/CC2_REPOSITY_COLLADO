/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author janxyz
 */
class Employee {
    String employeeID;
    String employeeName;
    double hourlyWage;
    double hoursWorked;

    // Constructor to initialize employee's details
    Employee(String employeeID, String employeeName, double hourlyWage, double hoursWorked) {
        // Use 'this' to refer to the instance variables
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate monthly salary
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    // Method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
    }
    
    void withSalary() {
        System.out.println("ID: " + employeeID + ", Name: " + employeeName + ", Wage: " + hourlyWage + ", Hours Worked: " + hoursWorked + ", Salary: " + calculateSalary());
    }
}

public class Lab8 {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("E001", "Alice Go", 15, 160);
        Employee employee2 = new Employee("E002", "Bob Hann", 18, 150);
        
        // Display employee details
        System.out.println("\nEmployee 1: ");
        employee1.displayEmployeeDetails();
        System.out.println("\nEmployee 2: ");
        employee2.displayEmployeeDetails();
        
        System.out.println("\nCalculating Salaries:");
        employee1.withSalary();
        employee2.withSalary();
    }
}
