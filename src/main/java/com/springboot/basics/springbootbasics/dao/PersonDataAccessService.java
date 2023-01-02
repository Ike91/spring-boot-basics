package com.springboot.basics.springbootbasics.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.springboot.basics.springbootbasics.model.Person;

@Component("postgres")
public class PersonDataAccessService implements PersonDao
{

	@Override
	public int insertPerson(UUID id, Person person)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> selectAllPeople()
	{
		return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
	}

	@Override
	public Optional<Person> selectPersonById(UUID id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deletePersonById(UUID ID)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
