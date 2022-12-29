package com.master.driver;

import org.openqa.selenium.WebDriver;

public class Driver {
    /**
     * to intiliase the local driver
     */
    public static void initDriver(){
       WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com");
        System.out.println("EdgeDriver launched successfully...");
    }

    public static void quitBrowser(){

        /**
         *
         */

    }


}
