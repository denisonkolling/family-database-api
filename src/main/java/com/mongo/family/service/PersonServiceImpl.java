package com.mongo.family.service;
import com.mongo.family.model.Person;
import com.mongo.family.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Boolean delete(String id) {
        Optional<Person> person = personRepository.findById(id);

        if (person.isPresent()) {
            personRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getById(String id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            return person.get();
        }
        return null;
    }

    @Override
    public Boolean update(Person person) {
        Optional<Person> personDb = personRepository.findById(person.getId());

        if (personDb.isPresent()){
            personRepository.save(person);
            return true;
        }
        return false;
    }
}
