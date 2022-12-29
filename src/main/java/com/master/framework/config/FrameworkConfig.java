package com.master.framework.config;

import com.master.converters.StringToBrowserConverter;
import com.master.converters.StringToURLConverter;
import com.master.enums.BrowserType;
import com.master.enums.RemoteNodeType;
import com.master.enums.RunModeType;
import org.aeonbits.owner.Config;

import java.net.URL;

//${user.dir}
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig  extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserConverter.class)
    BrowserType browser();

    @Key("runMode")
    RunModeType runModeType();
    @Key("runPlatForm")
    RemoteNodeType remoteNodeType();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();



}
