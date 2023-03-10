package com.acelerati.stock.infrastructure.entrypoints.apirest;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.domain.usecase.GetProductsByStock;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stock")
public class StockController {
    private final GetProductsByStock productsByStock;

    @GetMapping("/{idStock}")
    public ResponseEntity<Stock> findStockById(@PathVariable("idStock") Long idStock){
        var stock = productsByStock.findStockById(idStock);
        if (stock.getId() != null){
            return new ResponseEntity<>(stock, HttpStatus.OK);
        }
        return new ResponseEntity<>(stock, HttpStatus.NOT_FOUND);
    }
}

