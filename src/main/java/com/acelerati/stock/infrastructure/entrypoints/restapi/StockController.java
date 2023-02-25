package com.acelerati.stock.infrastructure.entrypoints.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
@RequestMapping(value = "/stocks")
public class StockController {
    @PutMapping("/{productId}")
    public ResponseEntity<?> updatePrice(@PathVariable("productId") int productId ){
        System.out.println("Paspo por updatePrice");
        return new ResponseEntity<>(productId, HttpStatus.OK);
    }
}