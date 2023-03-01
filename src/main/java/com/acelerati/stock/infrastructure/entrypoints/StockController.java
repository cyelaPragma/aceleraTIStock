package com.acelerati.stock.infrastructure.entrypoints;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.domain.usecase.GetStockUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aceleraTi/stock")
public class StockController {
    private final GetStockUseCase getStockUseCase;

    @GetMapping("/{idStock}")
    public ResponseEntity<Stock> findStockById(@PathVariable("idStock") Long idStock){
        Stock stock = getStockUseCase.findStockById(idStock);
        if (stock.getId() != null){
            return new ResponseEntity<>(stock, HttpStatus.OK);
        }
        return new ResponseEntity<>(stock, HttpStatus.NOT_FOUND);
    }

    @GetMapping("")
    public ResponseEntity<Page<Stock>> getAllProducts(Pageable pageable){
        return  new ResponseEntity<>(getStockUseCase.getAllStock(pageable), HttpStatus.OK);
    }
}
