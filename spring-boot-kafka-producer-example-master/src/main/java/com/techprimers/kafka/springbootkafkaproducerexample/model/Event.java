package com.techprimers.kafka.springbootkafkaproducerexample.model;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("Id")
	@Getter
	@Setter
	private String eventId;

	@Getter
	@Setter
	@JsonProperty("Payload")
	private Object payload;

}
