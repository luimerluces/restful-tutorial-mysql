package com.example.restfultutorialmysql.service;

import com.example.restfultutorialmysql.entity.DataExample;

import java.util.List;

public interface DataExampleService {
    //GET
    List<DataExample> getAllData();

    //POST
    DataExample saveData();

    //PUT
    DataExample updateDate();

    //DELETE
    void deleteData();

}
