package com.master.converters;

import com.master.enums.BrowserType;
import com.master.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRunModeConverter implements Converter<RunModeType> {
    @Override
    public RunModeType convert(Method method, String runMode) {

        return  RunModeType.valueOf(runMode.toUpperCase());
       // return BrowserType.valueOf(browserName);
    }
}
