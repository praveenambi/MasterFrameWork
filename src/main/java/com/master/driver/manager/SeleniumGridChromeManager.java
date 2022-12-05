package com.master.driver.manager;

import com.master.framework.config.ConfigFactory;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){

    }



    public static RemoteWebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(Browser.CHROME.browserName());
return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
    }
}
