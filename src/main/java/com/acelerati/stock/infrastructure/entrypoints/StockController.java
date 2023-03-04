package com.acelerati.stock.infrastructure.entrypoints;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.domain.usecase.StockUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class StockController {
    private final StockUseCase useCase;

    @GetMapping()
    public ResponseEntity<List<Stock>> getAllStock(){
        var stock = useCase.getAllStock();
        if (stock.isEmpty()){
            return new ResponseEntity<>(stock, HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(stock, HttpStatus.OK);
    }

    @GetMapping("/{idStock}")
    public ResponseEntity<Stock> findStockById(@PathVariable("idStock") Long idStock){
        var stock = useCase.findStockById(idStock);
        if (stock.getId() != null){
            return new ResponseEntity<>(stock, HttpStatus.OK);
        }
        return new ResponseEntity<>(stock, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/filterStock")
    public ResponseEntity<?> findProductsByCategoryAndBranAndSelPrice(
            @RequestParam String category, @RequestParam String brand, @RequestParam Double salePrice){
        var filterStock = useCase.findProductsByCategoryAndBranAndSelPrice(category, brand, salePrice);
        if (filterStock.isEmpty()){
            return new ResponseEntity<>(filterStock, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(filterStock, HttpStatus.OK);
    }
}
