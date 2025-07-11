package com.loosecoupling;

public class WebServiceProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Fetching data from web service";
    }
}
