package com.loosecoupling;

public class UserDatabaseProvider implements UserDataProvider {
    String databaseUrl;
    

    @Override
    public String toString() {
        return "UserDatabaseProvider [databaseUrl=" + databaseUrl + "]";
    }


    //a getter method from our interface to get user details
    public String getUserDetails(){
        return "User Details from database";
    }


    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
