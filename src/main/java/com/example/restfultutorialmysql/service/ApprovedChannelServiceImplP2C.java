package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.AllSumdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdOperationsP2C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.restfultutorialmysql.repository.ApprovedChannelRepositoryP2C;
@Service
public class ApprovedChannelServiceImplP2C implements ApprovedChannelServiceP2C{
    @Autowired
    ApprovedChannelRepositoryP2C approvedchannelRepository;
    @Override
    public List<String> getAllDateApprovedP2C(String IDREPORT) {
        return approvedchannelRepository.getAllDateApprovedP2C(IDREPORT);
    }

    public List<String> getAllTimeApprovedP2C(String Dates,int IDREPORT) {
        return approvedchannelRepository.getAllTimeApprovedP2C(Dates,IDREPORT);
    }    
    
    public List<RpOperationsdto> getAllApprovedRejectedP2C(String Date,String Time,int TypeReport) {        
        return approvedchannelRepository.getAllApprovedRejectedP2C(Date, Time,TypeReport);
    }
    
    public List<RpdOperationsP2C> getAllSUMP2C(String Date,String Time,int TypeReport1,int TypeReport2,int TypeReport3) {        
        return approvedchannelRepository.getAllSUMP2C(Date, Time,TypeReport1,TypeReport2,TypeReport3);
    }
    
    
    
}
