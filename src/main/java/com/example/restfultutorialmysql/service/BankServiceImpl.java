package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.entity.Bank;
import com.example.restfultutorialmysql.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
public class BankServiceImpl implements BankService{
    @Autowired
    BankRepository bankRepository;
    @Override
    public List<Bank> getAllData() {
        return bankRepository.findAll();
    }    
    @Override
    public Bank updateBank(Bank bank) {
        return bankRepository.save(bank);
    }     
    @Override
    public Optional<Bank> findByBankcode(String bankcode) {
       return bankRepository.findByBankcode(bankcode);
    }    
    public boolean updateProduct(Bank bank) {
        boolean status=false;
        try {
            bankRepository.save(bank);
            status=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    
}
