package com.mongo.family.controller;

import com.mongo.family.model.Person;
import com.mongo.family.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok().body(personService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getById(@PathVariable String id) {
        return ResponseEntity.ok().body(personService.getById(id));
    }

    @PostMapping("/person")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return ResponseEntity.ok().body(personService.create(person));
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Boolean> update(@RequestBody Person person) {
        return ResponseEntity.ok().body(personService.update(person));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        return ResponseEntity.ok().body(personService.delete(id));
    }

}
