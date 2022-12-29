package com.master.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  final class FireFoxmanager {


    private FireFoxmanager(){};

    public static WebDriver getDriver(){

        return  new FirefoxDriver();

    }
}
