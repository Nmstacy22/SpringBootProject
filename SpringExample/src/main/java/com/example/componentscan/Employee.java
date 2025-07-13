package com.example.componentscan;

import org.springframework.stereotype.Component;

@Component("employee1") // This annotation registers the class as a Spring bean with the id "employee"
public class Employee {
    private int employeeId;
    private String FirstName;
    private String LastName;
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
