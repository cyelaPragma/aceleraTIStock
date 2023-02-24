package com.acelerati.stock.infrastructure.entrypoints;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.domain.usecase.StockUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aceleraTi/stock")
public class StockController {
    private final StockUseCase useCase;

    @GetMapping("/{idStock}")
    public ResponseEntity<Stock> findStockById(@PathVariable("idStock") Long idStock){
        var stock = useCase.findStockById(idStock);
        if (stock.getId() != null){
            return new ResponseEntity<>(stock, HttpStatus.OK);
        }
        return new ResponseEntity<>(stock, HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Stock>> getAllProducts(){
        return  new ResponseEntity<>(useCase.getAllStock(), HttpStatus.OK);
    }
}
