package com.acelerati.stock.application.configuration;

import com.acelerati.stock.domain.model.getways.repositories.StockGateway;
import com.acelerati.stock.domain.model.getways.services.ProductServices;
import com.acelerati.stock.domain.usecase.ReadStockUseCase;
import com.acelerati.stock.domain.usecase.orchestrator.GetProductsByServiceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetProductsByServiceUseCase getProductsByServiceUseCase (ProductServices productServices){
        return new GetProductsByServiceUseCase(productServices);
    }

    @Bean
    public ReadStockUseCase readStockUseCase(StockGateway stockGateway){
        return new ReadStockUseCase(stockGateway);
    }
}

