package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.restfultutorialmysql.repository.ApprovedChannelRepositoryP2P;
@Service
public class ApprovedChannelServiceImplP2P implements ApprovedChannelServiceP2P{
    @Autowired
    ApprovedChannelRepositoryP2P approvedchannelRepository;
    @Override
    public List<String> getAllDateApprovedP2P(String IDREPORT) {
        return approvedchannelRepository.getAllDateApprovedP2P(IDREPORT);
    }

    public List<String> getAllTimeApprovedP2P(String Time,int IDREPORT) {
        return approvedchannelRepository.getAllTimeApprovedP2P(Time,IDREPORT);
    }    
    
    public List<RpOperationsdto> getAllApprovedRejectedP2P(String Date,String Time,int TypeReport) {        
        return approvedchannelRepository.getAllApprovedRejectedP2P(Date, Time,TypeReport);
    }
    
}
