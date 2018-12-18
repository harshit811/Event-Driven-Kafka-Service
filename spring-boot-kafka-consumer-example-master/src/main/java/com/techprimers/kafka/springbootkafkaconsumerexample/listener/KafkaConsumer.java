package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.Event;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.Payload;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	

	@Autowired
	private ObjectMapper objectMapper;


    @KafkaListener(topics = "test", group = "group_id")
    public void consume(String message) throws JsonProcessingException, IOException {
    	objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,true);

		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		JsonNode actualPayload = objectMapper.readTree(message);

		Event event = objectMapper.readValue(actualPayload.toString(), Event.class);
		
		Payload acs =event.getPayload();
        System.out.println("Consumed message: " + message);
        
    }


    @KafkaListener(topics = "test1", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
