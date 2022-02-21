package com.example.restfultutorialmysql.service;

import com.example.restfultutorialmysql.entity.DataExample;

import java.util.List;

public interface DataExampleService {
    //GET
    List<DataExample> getAllData();

    //POST
    DataExample saveData(DataExample dataExample);

    //PUT
    DataExample updateDate(DataExample dataExample);

    //DELETE
    void deleteDataById(Long id);

}
