package com.tightcoupling;

public class UserManager {
    //create a UserDatabase object which we are going to use in the get info method
    private UserDatabase userDatabase = new UserDatabase();

    //creating a getter method to get the user info
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }

}
