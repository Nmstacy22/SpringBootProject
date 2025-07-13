package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("ComponentScanDemo.xml");

    Employee employee =  (Employee) context.getBean("employee1");//get me the bean with the id, employee from the xml file and cast it to Employee type
    employee.toString();
    System.out.println(employee.toString());
    }
}
