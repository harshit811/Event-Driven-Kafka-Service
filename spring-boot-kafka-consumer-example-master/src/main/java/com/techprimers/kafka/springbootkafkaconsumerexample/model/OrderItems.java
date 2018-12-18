package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import java.io.Serializable;
import java.util.List;

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
public class OrderItems implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("ROW")
	@Getter
	@Setter
	private List<OrderItemDetail> orderItemDetails;
}
