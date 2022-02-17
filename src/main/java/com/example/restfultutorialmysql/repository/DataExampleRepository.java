package com.example.restfultutorialmysql.repository;

import org.springframework.stereotype.Repository;

//this is the implementation of the DAO interface
//data access object which lets you access and modify data
//the parameters are <TypeOfData, TypeOfId>
@Repository
public interface DataExampleRepository <DataExample, Long>{
}
