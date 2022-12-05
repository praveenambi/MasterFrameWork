package com.master.driver.manager;

import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class EdgeManager {

    private EdgeManager(){};

    public static WebDriver getDriver(){

        return  new EdgeDriver();
    }


}
