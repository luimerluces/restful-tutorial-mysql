package com.example.restfultutorialmysql.service;

import com.example.restfultutorialmysql.entity.Bank;
import com.example.restfultutorialmysql.entity.Business_Rules;

import java.util.List;
import java.util.Optional;

public interface BusineesRulesService {
    //GET
    List<Business_Rules> getAllData();       
}
