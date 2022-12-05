package com.master.driver.manager;

import com.master.enums.BrowserType;
import com.master.framework.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelenoidFireFoxManager {
    public static WebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"FIREFOX");
        capabilities.setCapability(CapabilityType.BROWSER_VERSION,"91.0");
        return  new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }
}
