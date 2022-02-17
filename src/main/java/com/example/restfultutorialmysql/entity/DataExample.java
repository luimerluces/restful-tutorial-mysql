package com.example.restfultutorialmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

//we define this is an entity
//entity is a POJO that interacts with the JPA
@Entity
//using lombok
//generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects)
// and beans: getters for all fields, setters for all non-final fields, and appropriate toString, equals and hashCode
//https://projectlombok.org/features/Data
@Data
//generate constructors
// https://projectlombok.org/features/constructor
@NoArgsConstructor
@AllArgsConstructor
public class DataExample {
    //all entity objects need an id
    //in this case every time new data added to the object
    //we get a new id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "data_id", nullable = false)
    private Long dataId;

    //make sure the email is not null
    //https://projectlombok.org/features/NonNull
    @NonNull
    private String email;
    private String name;
    private String data;

}
