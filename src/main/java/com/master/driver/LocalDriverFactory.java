package com.master.driver;

import com.master.driver.manager.ChromeManager;
import com.master.driver.manager.EdgeManager;
import com.master.enums.BrowserType;
import com.master.framework.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){

    }

    public static WebDriver getDriver(){
        WebDriver driver =null;
        if (ConfigFactory.getConfig().browser()== BrowserType.CHROME){
            driver = EdgeManager.getDriver();
        }else {
            driver = ChromeManager.getdriver();
        }

        return driver;
    }



}
