package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.entity.RpDcsErrorP2P;
import com.example.restfultutorialmysql.repository.RpErrorRepositoryP2P;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
public class RpErrorP2PServiceImpl implements RpErrorP2PService{
    @Autowired
    RpErrorRepositoryP2P rpErrorRepositoryP2P;
    @Override
    public List<String> getAllDateRpErrorP2P(String IDREPORT) {
        return rpErrorRepositoryP2P.findByDateRpErrorP2P(IDREPORT);
    }
    
    public List<String> getAllTimeRpErrorP2P(String Dates,String IDREPORT) {
        return rpErrorRepositoryP2P.findByTimeRpErrorP2P(Dates,IDREPORT);
    }
    
    
    public List<RpErrorsdto> getAllRpErrorP2P(String Dates,String Time,String IDREPORT) {
        return rpErrorRepositoryP2P.findByAllRpErrorP2P(Dates,Time,IDREPORT);
    }
}
 