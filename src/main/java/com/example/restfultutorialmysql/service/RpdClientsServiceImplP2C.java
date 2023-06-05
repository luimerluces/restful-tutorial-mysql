package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.repository.RpdClientsRepositoryP2C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.restfultutorialmysql.repository.RpdClientsRepositoryP2P;
@Service
public class RpdClientsServiceImplP2C implements RpdClientsServiceP2C{
    @Autowired
    RpdClientsRepositoryP2C rpdClientsRepository;
    @Override

    public List<String> getAllDateP2C(String IDREPORT) {
        return rpdClientsRepository.findByDateP2C(IDREPORT);
    }

    public List<String> getAllTimeP2C(String Date) {
        return rpdClientsRepository.findByTimeP2C(Date);
    }

    public List<RpClientsdto> getAllCLientP2C(String Date,String Time) {
        return rpdClientsRepository.getAllCLientP2C(Date,Time);
    }
    
  }
