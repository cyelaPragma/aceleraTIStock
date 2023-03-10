package com.acelerati.stock.testData;

import com.acelerati.stock.domain.model.stock.Stock;

public class DataStock {
    public static Stock stock01(){
        return new Stock(
                1L,
                1L,
                10,
                75.0,
                105.0
        );
    }
    public static Stock stock02(){
        return new Stock(
                2L,
                2L,
                8,
                85.0,
                100.0
        );
    }
}
