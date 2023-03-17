package com.acelerati.stock.mockData;

import com.acelerati.stock.domain.model.model.product.Brand;

public class BrandMockData {
    public static Brand brand01(){
        return new Brand(
                1L,
                "Pants",
                "The Nagasaki Lander is the trademarked"
                );
    }

    public static Brand brand02(){
        return new Brand(
                2L,
                "Chips",
                "Andy shoes are designed to keeping in mind durability"
        );
    }
}
