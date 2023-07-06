package com.mongo.family.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("people")
public class Person {

    @Id
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("city")
    public String city;

    @JsonProperty("birthday")
    public Date birthday;

    @JsonProperty("phone")
    public Integer phone;
}
