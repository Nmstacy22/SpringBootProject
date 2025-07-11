package com.loosecoupling;

public class WebServiceProvider implements UserDataProvider{
    private String webUrl;

    @Override
    public String toString() {
        return "WebServiceProvider [webUrl=" + webUrl + "]";
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    public String getUserDetails() {
        return "Fetching data from web service";
    }
}
