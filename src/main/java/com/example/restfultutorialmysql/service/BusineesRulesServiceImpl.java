package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.entity.Business_Rules;
import com.example.restfultutorialmysql.repository.BusineesRulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BusineesRulesServiceImpl implements BusineesRulesService{
    @Autowired
    BusineesRulesRepository busineesRulesRepository;
    @Override
    public List<Business_Rules> getAllData() {
        return busineesRulesRepository.findAll();
    }      
    
    public List<Business_Rules> findByProduct_Code(String code) {
        return busineesRulesRepository.findByProduct_Code(code);
    }        
    
    public List<Business_Rules> getBusinessRules() {
        return busineesRulesRepository.getBusinessRules();
    }        
    
    public List<Business_Rules> getBusinessRulesCode(String code) {
        return busineesRulesRepository.getBusinessRulesCode(code);
    }        
    
    public String getproduct_description(String product_code) {
        return busineesRulesRepository.product_description(product_code);
    }        
    
    public String getchannel_description(String Channel_code) {
        return busineesRulesRepository.channel_description(Channel_code);
    }        
    
    public String getmodality_description(String Modality_code) {
        return busineesRulesRepository.modality_description(Modality_code);
    }     
    public int updateBusinessRules(String ProductCode,int P_rowcount) {
        int status=0;
        try {
            busineesRulesRepository.UpdateBusineesRules_Status(ProductCode,P_rowcount);
            status=0;
        } catch (Exception e) {
            e.printStackTrace();
            status=1;
        }
        return status;
    }    
}
