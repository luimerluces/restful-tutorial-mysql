package com.example.restfultutorialmysql.repository;

import com.example.restfultutorialmysql.entity.DataExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//this is the implementation of the DAO interface
//data access object which lets you access and modify data
//the parameters are <TypeOfData, TypeOfId>
@Repository
public interface DataExampleRepository extends JpaRepository<DataExample, Long> {
}
