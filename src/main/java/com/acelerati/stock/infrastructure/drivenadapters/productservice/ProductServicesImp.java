package com.acelerati.stock.infrastructure.drivenadapters.productservice;

import com.acelerati.stock.domain.model.getways.services.ProductServices;
import com.acelerati.stock.domain.model.model.product.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductServicesImp implements ProductServices {

    private final ProductFeignClient productFeignClient;

    @Override
    public List<Product> getAllProducts() {
        return productFeignClient.getAllProducts();
    }

    @Override
    public Product findProductById(Long idProduct) {
        return productFeignClient.findProductById(idProduct);
    }
}
