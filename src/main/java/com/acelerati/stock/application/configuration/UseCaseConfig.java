package com.acelerati.stock.application.configuration;

import com.acelerati.stock.domain.usecase.StockUseCase;
import com.acelerati.stock.infrastructure.drivenadapters.restapi.StockFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public StockUseCase stockUseCase(StockFeignClient stockFeignClient){
        return new StockUseCase(stockFeignClient);
    }
}
