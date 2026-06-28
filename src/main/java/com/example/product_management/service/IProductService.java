package com.example.product_management.service;

import com.example.product_management.model.Product;


import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product updateProduct(int id, Product product);
    String deleteProduct(int id);


}
