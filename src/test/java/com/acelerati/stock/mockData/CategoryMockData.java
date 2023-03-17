package com.acelerati.stock.mockData;

import com.acelerati.stock.domain.model.model.product.Category;

public class CategoryMockData {
    public static Category category01(){
        return new Category(
                1L,
                "Automotive",
                "Andy shoes are designed to keeping in mind durability"
        );
    }

    public static Category category02(){
        return new Category(
                2L,
                "Tools",
                "Boston's most advanced compression wear technology"
        );
    }
}
