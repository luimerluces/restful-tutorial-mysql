package com.example.restfultutorialmysql.repository;

import com.example.restfultutorialmysql.entity.DataExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//this is the implementation of the DAO interface
//data access object which lets you access and modify data
//the parameters are <TypeOfData, TypeOfId>
@Repository
public interface DataExampleRepository extends JpaRepository<DataExample, Long> {

    //get data by email
    List<DataExample> findDataExampleByEmail(String email);

    //get data by name
    List<DataExample> findDataExampleByName(String name);

    //get data by id
    List<DataExample> findDataExampleByDataId(Long id);
}
