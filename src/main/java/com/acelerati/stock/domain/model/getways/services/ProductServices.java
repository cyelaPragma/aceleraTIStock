package com.acelerati.stock.domain.model.getways.services;

import com.acelerati.stock.domain.model.model.product.Product;

import java.util.List;

public interface ProductServices {
    List<Product> getAllProducts();
    Product findProductById(Long idProduct);
}
