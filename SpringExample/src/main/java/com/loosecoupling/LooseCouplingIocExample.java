package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tightcoupling.UserManager;

public class LooseCouplingIocExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
        // UserDataProvider databaseProvider = (UserDataProvider) context.getBean("userDatabase");
        // UserDataProvider webServiceProvider = (UserDataProvider) context.getBean("webService");

        UserManagers userManagerWithUserDatabaseProvider = (UserManagers) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithUserDatabaseProvider.getUserInfo());
        UserManagers userManagerWithWebServiceProvider = (UserManagers) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWebServiceProvider.getUserInfo());
    }
}
