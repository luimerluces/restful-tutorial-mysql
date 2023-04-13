package com.example.restfultutorialmysql.service;

import com.example.restfultutorialmysql.entity.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {
    //GET
    List<Bank> getAllData();       
    Bank updateBank(Bank bank);
    Optional<Bank> findByBankcode(String bankcode);        
    
}
