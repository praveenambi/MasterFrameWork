package com.master.driver.manager;

import com.master.driver.SeleniumGridFactory;
import com.master.enums.BrowserType;
import com.master.enums.RemoteNodeType;
import com.master.enums.RunModeType;
import com.master.framework.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class RemoteDriverManager {


    private RemoteDriverManager(){};


    public static WebDriver getDriver(RemoteNodeType remoteNodeType, BrowserType browserType) throws MalformedURLException {
        remoteNodeType = ConfigFactory.getConfig().remoteNodeType();
        if (remoteNodeType==RemoteNodeType.SELENIUM){
            return SeleniumGridFactory.getDriver(browserType);

        }else if (remoteNodeType== RemoteNodeType.SELENOID){

        }else {
        }
        return  null;
    }
}
