package com.mongo.family.service;

import com.mongo.family.model.Person;

import java.util.List;

public interface PersonService {

    Person create(Person person);

    Boolean delete(String id);

    List<Person> getAll();

    Person getById(String id);

    Boolean update(Person person);
}
