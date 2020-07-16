package com.main;

import com.prasad.HelloWorld;
import com.prasad.ProductServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        URL urlHello = new URL("http://localhost:7780/hello?wsdl");
        URL urlProduct = new URL("http://localhost:7780/product?wsdl");

        //1st argument service URI, refer to wsdl document above
        QName qnameHello = new QName("http://prasad.com/", "HelloWorldImplService");
        Service serviceHello = Service.create(urlHello, qnameHello);
        HelloWorld hello = serviceHello.getPort(HelloWorld.class);
        System.out.println(hello.getHi("prasad"));
        System.out.println(hello.getHelloWorldAsString());

        //2nd argument is service name, refer to wsdl document above
        QName qnameProduct = new QName("http://prasad.com/", "ProductServerImplService");
        Service serviceProduct = Service.create(urlProduct, qnameProduct);
        ProductServer productServer = serviceProduct.getPort(ProductServer.class);
        System.out.println(productServer.findProduct().getName());
        System.out.println(productServer.findAll()[1].getName());



    }
}


