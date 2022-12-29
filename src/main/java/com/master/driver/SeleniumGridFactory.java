package com.master.driver;

import com.master.driver.manager.SeleniumGridChromeManager;
import com.master.driver.manager.SeleniumGridFireFoxManager;
import com.master.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){
    }

    public  static WebDriver getDriver(BrowserType browserType) throws MalformedURLException {

        return browserType==BrowserType.CHROME
        ? SeleniumGridChromeManager.getDriver()
        : SeleniumGridFireFoxManager.getDriver();
    }
}
