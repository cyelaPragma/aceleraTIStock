package com.acelerati.stock.infrastructure.entrypoints.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/stocks")
public class StockController {

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{productId}")
    public ResponseEntity<?> updatePrice(@PathVariable("productId") int productId ){
        System.out.println("Pasó por updatePrice");
        return new ResponseEntity<>(productId, HttpStatus.OK);
    }
}