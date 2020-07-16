package com.main;

import com.prasad.HelloWorldImpl;
import com.prasad.ProductServerImpl;

import javax.xml.ws.Endpoint;

public class MainServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7780/hello", new HelloWorldImpl());
        Endpoint.publish("http://localhost:7780/product", new ProductServerImpl());
        System.out.println("Publishing Successfully");
    }
}
