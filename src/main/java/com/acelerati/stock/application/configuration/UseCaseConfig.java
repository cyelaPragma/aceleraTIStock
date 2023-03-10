package com.acelerati.stock.application.configuration;

import com.acelerati.stock.domain.model.getways.StockGateway;
import com.acelerati.stock.domain.usecase.GetProductsByStock;
import com.acelerati.stock.infrastructure.drivenadapters.productservice.StockFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public GetProductsByStock getProductUseCase(StockFeignClient stockFeignClient, StockGateway stockGateway){
        return new GetProductsByStock(stockFeignClient, stockGateway);
    }
}

