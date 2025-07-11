package com.loosecoupling;


public class UserManagers {
    //Creating an object/reference variable of the UserDataProvider interface
    private UserDataProvider userDataProvider;

    //creating a constructor
    public UserManagers(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
    //creating a getter method to get the user info
    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }

}
