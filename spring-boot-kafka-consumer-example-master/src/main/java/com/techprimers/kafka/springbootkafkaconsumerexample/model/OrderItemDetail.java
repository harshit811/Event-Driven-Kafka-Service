package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("orderNumber")
	@Getter
	@Setter
	private Integer orderNumber;
	
	@JsonProperty("OrderStuff")
	@Getter
	@Setter
	private String orderStuff;
	
	
}
	