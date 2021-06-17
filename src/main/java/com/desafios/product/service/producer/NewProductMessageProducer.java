package com.desafios.product.service.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewProductMessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final String  QUEUE_NAME = "course.queue";
    public void send(String product){
        rabbitTemplate.convertAndSend(QUEUE_NAME, product);
    }
}
