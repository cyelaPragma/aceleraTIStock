package com.acelerati.stock.application.configuration;

import com.acelerati.stock.domain.model.gateways.StockGateway;
import com.acelerati.stock.domain.usecase.GetStockUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public GetStockUseCase getStockUseCase(StockGateway stockGateway){
        return new GetStockUseCase(stockGateway);
    }
}
