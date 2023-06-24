package com.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.ws.NameProvider", serviceName = "NameProviderService")
public class NameProviderImpl implements NameProvider{
    @Override
    public String getName(String name) {
        return "client_"+name;
    }

}