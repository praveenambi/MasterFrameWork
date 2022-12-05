package com.master.driver;

import com.master.driver.manager.SeleniumGridChromeManager;
import com.master.driver.manager.SeleniumGridFireFoxManager;
import com.master.driver.manager.SelenoidChromeManager;
import com.master.driver.manager.SelenoidFireFoxManager;
import com.master.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class SelenoidFactory {

    private SelenoidFactory(){

    }
    public  static WebDriver getDriver(BrowserType browserType){

        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFireFoxManager.getDriver();
    }
}
