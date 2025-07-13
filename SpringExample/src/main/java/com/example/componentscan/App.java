package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Employee employee =  (Employee) context.getBean("employee1");//get me the bean with the id, employee from the xml file and cast it to Employee type
    employee.toString();
    System.out.println(employee.toString());

    Manager manager = context.getBean("manager",Manager.class); //get me the bean of type Manager
    System.out.println(manager.toString());
    }
}
