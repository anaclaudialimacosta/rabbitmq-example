package com.desafios.product.service.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NewProductMessageConsumer {

    private  static final String QUEUE_NAME = "course.queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void listen(String message){
        System.out.println(message);
    }
}
