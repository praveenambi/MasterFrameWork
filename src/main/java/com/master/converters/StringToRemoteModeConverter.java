package com.master.converters;

import com.master.enums.RemoteNodeType;
import com.master.enums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeConverter implements Converter<RemoteNodeType> {
    @Override
    public RemoteNodeType convert(Method method, String remoteNode) {

        return  RemoteNodeType.valueOf(remoteNode.toUpperCase());
    }
}
