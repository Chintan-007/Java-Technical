package com.chintan.assignment.utilities;
import com.chintan.assignment.employee.Employee;
import com.chintan.assignment.employee.Manager;
import com.chintan.assignment.employee.Developer;

/**
 * The EmployeeUtilities class provides utility methods for employee operations.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * @param employee the employee whose details are to be printed.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
        
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}
