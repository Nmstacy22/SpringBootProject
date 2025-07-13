package com.example.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee1") // This annotation registers the class as a Spring bean with the id "employee"
public class Employee {
    private int employeeId;
    @Value("John") // Injects the value "John" into the FirstName field
    private String FirstName;
    @Value("${java.home}") // Injects the value of the system property "java.home" into the LastName field
    private String LastName;
    @Value("#{4*4}") // Injects the value 16 into the salary field using SpEL (Spring Expression Language)
    private double salary;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", FirstName=" + FirstName + ", LastName=" + LastName
                + ", salary=" + salary + "]";
    }

    
}
