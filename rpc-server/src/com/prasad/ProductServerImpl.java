package com.prasad;

import com.dao.ProductDao;
import com.entity.Product;

import javax.jws.WebService;
import java.util.ArrayList;

//Service Implementation
@WebService(endpointInterface = "com.prasad.ProductServer")
public class ProductServerImpl implements ProductServer{

    private ProductDao productDao = new ProductDao();

    @Override
    public Product findProduct() {
        return productDao.findProduct();
    }

    @Override
    public Product[] findAll() {
        return productDao.findAll();
    }
}
