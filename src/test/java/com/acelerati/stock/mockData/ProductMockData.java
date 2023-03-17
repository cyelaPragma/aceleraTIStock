package com.acelerati.stock.mockData;

import com.acelerati.stock.domain.model.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMockData {
    public static Product Product01(){
        return new Product(
                1L,
                "Bespoke Frozen Chips",
                "Elegant",
                BrandMockData.brand01(),
                CategoryMockData.category01(),
                "The slim & simple Maple Gaming Keyboard from"
        );
    }

    public static Product Product02(){
        return new Product(
                2L,
                "Rustic Soft Car",
                "Oriental",
                BrandMockData.brand02(),
                CategoryMockData.category02(),
                "The automobile layout consists of a front-engine design"
        );
    }

    public static List<Product> getListProducts(){
        List<Product> products = new ArrayList<>();
        products.add(Product01());
        products.add(Product02());
        return products;
    }

}
