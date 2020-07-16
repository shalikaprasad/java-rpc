package com.prasad;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.prasad.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString() {
        return "Hello World JAX-WS.";
    }

    @Override
    public String getHi(String name) {
        return "Hello " + name + ",";
    }
}
