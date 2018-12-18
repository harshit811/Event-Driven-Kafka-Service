package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class User {

	@JsonProperty("name")
	@Getter
	@Setter
	private String name;

	private String dept;

	private Integer sal;

}