package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.entity.Affiliation;
import com.example.restfultutorialmysql.repository.AffiliationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AffiliationServiceImpl implements AffiliationService{
    @Autowired
    AffiliationRepository affiliationRepository;    
    @Override
    public List<Affiliation> getAllData() {
        return affiliationRepository.findAll();
    }
}
