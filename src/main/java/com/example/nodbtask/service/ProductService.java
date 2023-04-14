package com.example.nodbtask.service;

import com.example.nodbtask.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product findById(Long id);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    Product deleteProduct(Long id);
}
