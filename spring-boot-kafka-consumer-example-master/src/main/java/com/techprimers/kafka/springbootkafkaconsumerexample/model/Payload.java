package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class Payload {
	
	@JsonProperty("Item")
	@Getter
	@Setter
	private OrderItems orderItems;

}
