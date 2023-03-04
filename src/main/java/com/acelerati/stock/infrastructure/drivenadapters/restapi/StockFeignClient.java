package com.acelerati.stock.infrastructure.drivenadapters.restapi;

import com.acelerati.stock.domain.model.stock.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}")
public interface StockFeignClient {
    @GetMapping(value = "/product", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Stock> getAllStock();

    @GetMapping(value = "/product/{idStock}", consumes = MediaType.APPLICATION_JSON_VALUE)
    Stock findStockById(@PathVariable("idStock") Long id);

    @GetMapping(value = "/product/filterStock", consumes = MediaType.APPLICATION_JSON_VALUE )
    List<Stock> findProductsByCategoryAndBranAndSelPrice(
            @RequestParam String category, @RequestParam String brand, @RequestParam Double salePrice);
}
