package com.example.product_management.service.impl;

import com.example.product_management.model.Product;
import com.example.product_management.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private final List<Product> PRODUCTS = List.of(
            new Product(1, "Laptop Dell", 15000000),
            new Product(2, "Iphone 12", 14000000),
            new Product(3, "Ipad m4", 22000000)
    );

    @Override
    public List<Product> getAllProducts() {
        return PRODUCTS;
    }
}
