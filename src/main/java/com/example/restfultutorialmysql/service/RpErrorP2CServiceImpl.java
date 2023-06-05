package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.entity.RpDcsErrorP2P;
import com.example.restfultutorialmysql.repository.RpErrorRepositoryP2C;
import com.example.restfultutorialmysql.repository.RpErrorRepositoryP2P;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
public class RpErrorP2CServiceImpl implements RpErrorP2CService{
    @Autowired
    RpErrorRepositoryP2C rpErrorRepositoryP2C;
    @Override
    public List<String> getAllDateRpErrorP2C(String IDREPORT) {
        return rpErrorRepositoryP2C.findByDateRpErrorP2C(IDREPORT);
    }
    
    public List<String> getAllTimeRpErrorP2C(String Dates,String IDREPORT) {
        return rpErrorRepositoryP2C.findByTimeRpErrorP2C(Dates,IDREPORT);
    }
    
    
    public List<RpErrorsdto> getAllRpErrorP2C(String Dates,String Time,String IDREPORT) {
        return rpErrorRepositoryP2C.findByAllRpErrorP2C(Dates,Time,IDREPORT);
    }
}
 