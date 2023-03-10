package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.getways.StockGateway;
import com.acelerati.stock.domain.model.product.Product;
import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.productservice.StockFeignClient;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetProductsByStock {
    private final StockFeignClient stockfeignClient;
    private final StockGateway stockGateway;

    public List<Product> getAllProducts(){
        return stockfeignClient.getAllProducts();
    }

    public Product findProductById(Long idProduct){
        return stockfeignClient.findProductById(idProduct);
    }

    public Stock findStockById(Long idStock) {
        return stockGateway.findStockById(idStock);
    }
}

