package com.loosecoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManagers userManagerWithDB = new UserManagers(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceProvider();
        UserManagers userManagerWithWS = new UserManagers(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
