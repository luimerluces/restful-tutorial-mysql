package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.BusinessRulesJsondto;
import com.example.restfultutorialmysql.entity.Business_Rules;
import com.example.restfultutorialmysql.response.MessageResponse;
import com.example.restfultutorialmysql.service.BusineesRulesServiceImpl;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
public class ControllerBusinessRules {
    @Autowired
    BusineesRulesServiceImpl businessRulesService;
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getBusinessRules",  produces="application/json")
    public List<BusinessRulesJsondto>getBusinessRules() {
        String product_description="";
        List<Business_Rules> Business_RulesList = businessRulesService.getBusinessRules();         
        List<BusinessRulesJsondto> BusinessRuleslist = new ArrayList<BusinessRulesJsondto>();        
         for (Business_Rules n : Business_RulesList) {                          
             BusinessRulesJsondto br = new BusinessRulesJsondto();             
             br.setProductCode(n.getProductcode());                     
             br.setProduct(n.getProductcode()+ "-"+ businessRulesService.getproduct_description(n.getProductcode()));
             br.setChannel(n.getChannelcode()+ "-"+ businessRulesService.getchannel_description(n.getChannelcode()));
             br.setModality(n.getModalitycode()+ "-" +businessRulesService.getmodality_description(n.getModalitycode()));
             br.setStatus(n.getStatus());
             BusinessRuleslist.add(br);             
         }
         return BusinessRuleslist;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getBusinessRulesCode/{code}",  produces="application/json")
    public List<BusinessRulesJsondto>getBusinessRulesCode(@PathVariable("code") String code) {
        String product_description="";
        List<Business_Rules> Business_RulesList = businessRulesService.getBusinessRulesCode(code);         
        List<BusinessRulesJsondto> BusinessRuleslist = new ArrayList<BusinessRulesJsondto>();        
        for (Business_Rules n : Business_RulesList) {                          
             BusinessRulesJsondto br = new BusinessRulesJsondto();             
             br.setProductCode(n.getProductcode());                     
             br.setProduct(n.getProductcode()+ "-"+ businessRulesService.getproduct_description(n.getProductcode()));
             br.setChannel(n.getChannelcode()+ "-"+ businessRulesService.getchannel_description(n.getChannelcode()));
             br.setModality(n.getModalitycode()+ "-" +businessRulesService.getmodality_description(n.getModalitycode()));
             br.setStatus(n.getStatus());
             BusinessRuleslist.add(br);             
         }
         return BusinessRuleslist;
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/UpdateBusinessRules")
    public ResponseEntity<?> UpdateBusinessRules(@RequestBody BusinessRulesJsondto businessRulesJsondto) {
        MessageResponse msj = new MessageResponse();
        int updateBusinessRules= businessRulesService.updateBusinessRules(businessRulesJsondto.getProductCode(),0);
        System.out.println(updateBusinessRules);
            if (updateBusinessRules==0){
                msj.setSuccess(true);
                msj.setMessage("Business Rules updated successfully");            
            }else{
                msj.setSuccess(false);
                msj.setMessage("Business Rules they were not updated");            
            }                 
	return new ResponseEntity<MessageResponse>(msj,HttpStatus.OK);                
    }         
}