package com.springboot.basics.springbootbasics.model;

import java.util.UUID;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person
{
	private UUID id;
	
	@NonNull
	private String name;
	 
	
	public Person(@JsonProperty("id")UUID id, @JsonProperty("name")String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	
	public UUID getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
	
}
