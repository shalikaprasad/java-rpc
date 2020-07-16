package com.dao;

import com.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public Product findProduct(){
        return new Product(1, "apple", 120);
    }

    public Product[] findAll(){
        Product[] result = new Product[3];
        result[0] = new Product(1, "apple", 120);
        result[1] = new Product(1, "orange", 100);
        result[2] = new Product(1, "tree", 250);
        return result;
    }
}
