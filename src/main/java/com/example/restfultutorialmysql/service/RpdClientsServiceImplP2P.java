package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.restfultutorialmysql.repository.RpdClientsRepositoryP2P;
@Service
public class RpdClientsServiceImplP2P implements RpdClientsServiceP2P{
    @Autowired
    RpdClientsRepositoryP2P rpdClientsRepository;
    @Override
    public List<String> getAllDateP2P(String IDREPORT) {
        return rpdClientsRepository.findByDateP2P(IDREPORT);
    }    
    
    public List<String> getAllTimeP2P(String Date) {
        return rpdClientsRepository.findByTimeP2P(Date);
    }
   
    public List<RpClientsdto> getAllCLientP2P(String Date,String Time) {
        return rpdClientsRepository.getAllCLientP2P(Date,Time);
    }
  }
