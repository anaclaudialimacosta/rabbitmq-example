package com.desafios.product.service;

import com.desafios.product.service.producer.NewProductMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private NewProductMessageProducer producer;

    public void create(String product){
        producer.send(product);
    }
}
