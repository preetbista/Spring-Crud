package com.example.nodbtask.service.impl;

import com.example.nodbtask.model.Product;
import com.example.nodbtask.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Map<Long, Product> productMap = new HashMap<>();

    static {
        Product product1 = new Product(1L, "Laptop", "LP1", 120000L, 12L);
        Product product2 = new Product(2L, "Computer", "Cm4", 11000L, 8L);
        productMap.put(1L, product1);
        productMap.put(2L, product2);
    }

    public List<Product> getAllProduct() {
        return new ArrayList<>(productMap.values());
    }

    public Product findById(Long id) {
        return productMap.get(id);
    }

    public Product addProduct(Product product) {
        // Get the next available ID by adding 1 to the current size of the productMap
        Long nextId = (long) (productMap.size() + 1);
        product.setId(nextId);
        productMap.put(nextId, product);
        return product;
    }

    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        productMap.put(id, product);
        return product;
    }

    public Product deleteProduct(Long id) {
        return productMap.remove(id);
    }
}