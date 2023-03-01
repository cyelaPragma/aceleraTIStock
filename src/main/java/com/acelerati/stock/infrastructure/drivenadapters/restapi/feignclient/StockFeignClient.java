package com.acelerati.stock.infrastructure.drivenadapters.restapi.feignclient;

import com.acelerati.stock.domain.model.stock.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}")
public interface StockFeignClient {
    @GetMapping(value = "/stock", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Stock> getAllStock();

    @GetMapping(value = "/stock/{idStock}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Stock findStockById(@PathVariable("idStock") Long id);
}
