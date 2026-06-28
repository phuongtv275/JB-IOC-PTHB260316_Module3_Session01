package com.example.product_management.service.impl;

import com.example.product_management.model.Product;
import com.example.product_management.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private static List<Product> products= new ArrayList<>();

    static {
        products.add(new Product(1, "Laptop Dell", 15000000));
        products.add(new Product(2, "Iphone 12", 14000000));
        products.add(new Product(3, "Ipad m4", 22000000));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product saveProduct(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                return p;
            }
        }
        return null;
    }

    @Override
    public String deleteProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                return "Xóa thành công sản phẩm ID: " + id;
            }
        }
        return "Không tồn tại sản phẩm ID: " + id;
    }
}
