package com.example.restfultutorialmysql.service;


import com.example.restfultutorialmysql.entity.DataExample;
import com.example.restfultutorialmysql.repository.DataExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataExampleServiceImpl implements DataExampleService{

    @Autowired
    DataExampleRepository dataExampleRepository;

    @Override
    public List<DataExample> getAllData() {
        return null;
    }

    @Override
    public DataExample saveData() {
        return null;
    }

    @Override
    public DataExample updateDate() {
        return null;
    }

    @Override
    public void deleteData() {

    }
}
