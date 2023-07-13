package org.example.dao;

import org.example.model.Product;

import java.util.List;

public interface ProductDAO {
    void saveProduct(Product product);

    List<Product> getAllProducts();
    Product getProductById(int productId);
    void updateProduct(Product product);
    void deleteProduct(int productId);
}
