package com.prasad;

import com.entity.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.ArrayList;
import java.util.List;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface ProductServer {

    @WebMethod
    public Product findProduct();

    @WebMethod
    public Product[] findAll();
}