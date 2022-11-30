package com.master.test;

import com.master.framework.config.ConfigFactory;
import com.master.framework.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SelApp {

    @Test
    public void testLaunch(){
      //  FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
        System.out.println(ConfigFactory.getConfig().browser());

//        WebDriver driver = new EdgeDriver();
//        driver.get("https://google.com");
//        System.out.println("EdgeDriver launched successfully...");

    }

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        System.out.println("EdgeDriver launched successfully...");
    }
}
