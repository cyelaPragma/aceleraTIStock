package com.acelerati.stock.domain.usecase.orchestrator;

import com.acelerati.stock.domain.model.model.stock.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class GetStockUseCaseTest {
    private GetStockUseCase getStockUseCase;
    @BeforeEach
    void setUp(){
        getStockUseCase = new GetStockUseCase();
    }

    @Test
    void readOneStockSuccess(){
        List<Stock> stocks = getStockUseCase.getStocks();
        Assertions.assertEquals(stocks.size(), 1);
    }

    @Test
    void readManyStockSuccess(){

    }

    @Test
    void readEmptyStockSuccess(){

    }

    @Test
    void readStockError(){

    }

}