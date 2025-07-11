package com.loosecoupling;

public class UserDatabaseProvider implements UserDataProvider {
    //a getter method from our interface to get user details

    public String getUserDetails(){
        return "User Details from database";
    }
}
