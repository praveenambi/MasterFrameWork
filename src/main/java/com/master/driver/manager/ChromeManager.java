package com.master.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ChromeManager {


    private ChromeManager() {
    }

    ;

    public static WebDriver getdriver() {

        return new ChromeDriver();

    }
}
