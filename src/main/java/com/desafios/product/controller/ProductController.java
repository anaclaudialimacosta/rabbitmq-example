package com.desafios.product.controller;

import com.desafios.product.model.dto.ProductRequestDto;
import com.desafios.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody ProductRequestDto productRequestDto){
        productService.create(productRequestDto.getDescricao());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
