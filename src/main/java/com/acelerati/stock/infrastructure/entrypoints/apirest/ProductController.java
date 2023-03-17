package com.acelerati.stock.infrastructure.entrypoints.apirest;

import com.acelerati.stock.domain.model.model.product.Product;
import com.acelerati.stock.domain.usecase.orchestrator.GetProductsByServiceUseCase;
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
@RequestMapping("/products")
public class ProductController {
    private final GetProductsByServiceUseCase getProductsByServiceUseCase;

    @GetMapping()
    public ResponseEntity<List<Product>> getAllStock(){
        var products = getProductsByServiceUseCase.getAllProducts();
        if (products.isEmpty()){
            return new ResponseEntity<>(products, HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{idProduct}")
    public ResponseEntity<Product> findProductById(@PathVariable("idProduct") Long idProduct ){
        var product = getProductsByServiceUseCase.findProductById(idProduct);
        if (product.getId() !=null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        return new ResponseEntity<>(product, HttpStatus.NOT_FOUND);
    }
}

