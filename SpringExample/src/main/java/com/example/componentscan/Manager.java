package com.example.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Manager {
    private Employee employee;

    @Autowired // This annotation allows Spring to automatically inject the Employee bean into this Manager class
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager [employee=" + employee + "]";
    }

    
    
}
