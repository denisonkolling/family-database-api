package com.mongo.family.repository;

import com.mongo.family.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository  extends MongoRepository<Person, String> {
}
