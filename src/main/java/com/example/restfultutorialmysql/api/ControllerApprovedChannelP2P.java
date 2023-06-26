package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.TimeError;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.service.ApprovedChannelServiceImplP2P;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;  
@RestController
public class ControllerApprovedChannelP2P {
    @Autowired
    ApprovedChannelServiceImplP2P ApprovedChannelService;
    @CrossOrigin(origins = "*")    
    @GetMapping(value = "/getAllDateOperationsRejectedApprovedP2P/{IDREPORT}",  produces="application/json")
    public List<Dates> getAllDateApprovedP2P(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = ApprovedChannelService.getAllDateApprovedP2P(IDREPORT); 
        List<Dates> listDate = new ArrayList<Dates>();
         for (String n : dateList) {
             Dates date = new Dates();
             date.setDates(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeOperationsRejectedApprovedP2P/{dates}/{IDREPORT}",  produces="application/json")
    public List<TimeError> getAllTimeApprovedP2P(@PathVariable("dates") String dates,@PathVariable("IDREPORT") int IDREPORT) {                
        List<String> TimeList = ApprovedChannelService.getAllTimeApprovedP2P(dates, IDREPORT);
        List<TimeError> times = new ArrayList<TimeError>();
         for (String n : TimeList) {
             TimeError time = new TimeError();
             time.setTime(n);
             times.add(time);
         }
         return times;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllOperationsApprovedRejectedP2P/{dates}/{time}/{TypeReport}",  produces="application/json")
    public List<RpOperationsdto> getAllApprovedRejectedP2P(@PathVariable("dates") String Dates,@PathVariable("time") String Time,@PathVariable("TypeReport") int TypeReport) {                        
        List<RpOperationsdto> OperacionesList = ApprovedChannelService.getAllApprovedRejectedP2P(Dates,Time,TypeReport);         
        return OperacionesList;
    }
}
