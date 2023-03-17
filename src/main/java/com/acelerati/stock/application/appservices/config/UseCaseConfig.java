package com.acelerati.stock.application.appservices.config;

import com.acelerati.stock.domain.model.gateways.repositories.StockRepository;
import com.acelerati.stock.domain.usecase.ReadStockUseCase;
import com.acelerati.stock.infrastructure.drivenadapters.mysqladapter.StockRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public StockRepositoryImpl stockRepository() {
        return new StockRepositoryImpl();
    }

}
