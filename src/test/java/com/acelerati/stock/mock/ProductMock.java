package com.acelerati.stock.mock;

import com.acelerati.stock.domain.model.model.product.Brand;
import com.acelerati.stock.domain.model.model.product.Category;
import com.acelerati.stock.domain.model.model.product.Product;

public class ProductMock {
    public static Product createProduct(Long id) {
        return new Product(id,
                "test",
                "test",
                new Brand(id,"test","test"),
                new Category(id,"test","test"),
                "test");
    }
}
