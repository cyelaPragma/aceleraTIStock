package com.acelerati.stock.domain.usecase.orchestrator;

import com.acelerati.stock.domain.model.getways.services.ProductServices;
import com.acelerati.stock.domain.model.model.product.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetProductsByServiceUseCase {
    private final ProductServices productServices;

    public List<Product> getAllProducts(){
        return productServices.getAllProducts();
    }

    public Product findProductById(Long idProduct){
        return productServices.findProductById(idProduct);
    }
}

