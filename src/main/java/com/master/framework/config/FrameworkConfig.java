package com.master.framework.config;

import com.master.converters.StringToBrowserConverter;
import org.aeonbits.owner.Config;

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

}
