package com.github.yshameer.spring.activemq.publish.service.api;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class PublishMessageApiController implements PublishMessageApi {

    @Autowired
    ProducerTemplate producerTemplate;



    @Override
    public ResponseEntity<String> publishMessage(String queueName, String message) {
        producerTemplate.sendBody("jms:queue:"+queueName, message);
        return new ResponseEntity<>("Message published successfully", HttpStatus.OK);
    }
}
