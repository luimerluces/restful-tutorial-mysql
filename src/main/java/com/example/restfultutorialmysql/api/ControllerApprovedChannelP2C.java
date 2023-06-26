package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.AllSumdto;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.TimeError;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdOperationsP2C;
import com.example.restfultutorialmysql.service.ApprovedChannelServiceImplP2C;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;  
import com.example.restfultutorialmysql.service.ApprovedChannelServiceP2C;
@RestController
public class ControllerApprovedChannelP2C {
    @Autowired
    ApprovedChannelServiceImplP2C ApprovedChannelService;
    @CrossOrigin(origins = "*")    
    @GetMapping(value = "/getAllDateOperationsRejectedApprovedP2C/{IDREPORT}",  produces="application/json")
    public List<Dates> getAllDateApprovedP2C(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = ApprovedChannelService.getAllDateApprovedP2C(IDREPORT); 
        List<Dates> listDate = new ArrayList<Dates>();
         for (String n : dateList) {
             Dates date = new Dates();
             date.setDates(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeOperationsRejectedApprovedP2C/{dates}/{IDREPORT}",  produces="application/json")
    public List<TimeError> getAllTimeApprovedP2C(@PathVariable("dates") String Dates,@PathVariable("IDREPORT") int IDREPORT) {                
        List<String> TimeList = ApprovedChannelService.getAllTimeApprovedP2C(Dates, IDREPORT);
        List<TimeError> timesList = new ArrayList<TimeError>();
         for (String n : TimeList) {
             TimeError time = new TimeError();
             time.setTime(n);
             timesList.add(time);
         }
         return timesList;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllOperationsApprovedRejectedP2C/{dates}/{Time}/{TypeReport}",  produces="application/json")
    public List<RpOperationsdto> getAllApprovedRejectedP2C(@PathVariable("dates") String Dates,@PathVariable("Time") String Time,@PathVariable("TypeReport") int TypeReport) {                        
        List<RpOperationsdto> OperacionesList = ApprovedChannelService.getAllApprovedRejectedP2C(Dates,Time,TypeReport);         
        return OperacionesList;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllSUMP2C/{dates}/{Time}/{TypeReport1}/{TypeReport2}/{TypeReport3}",  produces="application/json")
    public List<AllSumdto> getAllSUMP2C(@PathVariable("dates") String Dates,@PathVariable("Time") String Time,@PathVariable("TypeReport1") int TypeReport1,@PathVariable("TypeReport2") int TypeReport2,@PathVariable("TypeReport3") int TypeReport3) {                                
        List<RpdOperationsP2C> AllSumList = ApprovedChannelService.getAllSUMP2C(Dates,Time,TypeReport1,TypeReport2,TypeReport3);         
        List<AllSumdto> listResultSumP2C = new ArrayList<AllSumdto>();
        for (RpdOperationsP2C n : AllSumList) {             
             AllSumdto dto = new AllSumdto();             
             dto.setNumRegister(n.getNumregister());                          
             dto.setDescription(n.getDescription());
             listResultSumP2C.add(dto);
         }
        return listResultSumP2C;
    }    
}
