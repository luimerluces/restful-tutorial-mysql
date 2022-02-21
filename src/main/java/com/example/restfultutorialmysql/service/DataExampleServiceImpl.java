package com.example.restfultutorialmysql.service;


import com.example.restfultutorialmysql.entity.DataExample;
import com.example.restfultutorialmysql.repository.DataExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//we define this cass as a service
//so we can use it as a bean in our Controller
@Service
public class DataExampleServiceImpl implements DataExampleService{

    //bean injection
    //https://stackoverflow.com/questions/39890849/what-exactly-is-field-injection-and-how-to-avoid-it
    //the link above is to clarify if you get any kind of warning with @Autowired
    //we get the repository that will interact
    //with the database through our entity objects
    @Autowired
    DataExampleRepository dataExampleRepository;

    //implement all the CRUD methods
    //READ
    @Override
    public List<DataExample> getAllData() {
        return dataExampleRepository.findAll();
    }
    //CREATE
    @Override
    public DataExample saveData(DataExample dataExample) {
        return dataExampleRepository.save(dataExample);
    }
    //UPDATE
    @Override
    public DataExample updateDate(DataExample dataExample) {
        return dataExampleRepository.save(dataExample);
    }
    //DELETE
    @Override
    public void deleteDataById(Long id) {
        dataExampleRepository.deleteById(id);
    }
}
