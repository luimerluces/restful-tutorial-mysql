package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.entity.Type_Error_Rp;
import com.example.restfultutorialmysql.dto.DateError;
import com.example.restfultutorialmysql.dto.TimeError;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.dto.TypeErrordto;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.restfultutorialmysql.service.TypeErrorServiceImpl;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
public class ControllerTypeError {
    @Autowired   
    TypeErrorServiceImpl typeErrorService;
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/TypeError",  produces="application/json")
    public List<TypeErrordto> getAllTypeError() {                        
        List<TypeErrordto> ErrorList = typeErrorService.getAllTypeError();         
        return ErrorList;
    }
    @CrossOrigin(origins = "*")    
    @GetMapping(value = "/getAllDateErrorP2P/{IDREPORT}",  produces="application/json")
    public List<DateError> getDateErrorP2P(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = typeErrorService.getAllDateErrorP2P(IDREPORT); 
        List<DateError> listDate = new ArrayList<DateError>();
         for (String n : dateList) {
             DateError date = new DateError();
             date.setDate(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")    
    @GetMapping(value = "/getAllDateErrorP2C/{IDREPORT}",  produces="application/json")
    public List<DateError> getDateErrorP2C(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = typeErrorService.getAllDateErrorP2C(IDREPORT); 
        List<DateError> listDate = new ArrayList<DateError>();
         for (String n : dateList) {
             DateError date = new DateError();
             date.setDate(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeErrorP2P/{date}",  produces="application/json")
    public List<TimeError> getTimeErrorP2P(@PathVariable("date") String Date) {                
        List<String> timeList = typeErrorService.getAllTimeErrorP2P(Date); 
        List<TimeError> listTime = new ArrayList<TimeError>();
         for (String n : timeList) {
             TimeError time = new TimeError();
             time.setTime(n);
             listTime.add(time);
         }
         return listTime;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeErrorP2C/{date}",  produces="application/json")
    public List<TimeError> getTimeErrorP2C(@PathVariable("date") String Date) {                
        List<String> timeList = typeErrorService.getAllTimeErrorP2C(Date); 
        List<TimeError> listTime = new ArrayList<TimeError>();
         for (String n : timeList) {
             TimeError time = new TimeError();
             time.setTime(n);
             listTime.add(time);
         }
         return listTime;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllErrorP2P/{date}/{time}",  produces="application/json")
    public List<RpErrorsdto> getAllErrorP2P(@PathVariable("date") String Date,@PathVariable("time") String Time) {                        
        List<RpErrorsdto> timeList = typeErrorService.getAllErrorP2P(Date,Time);         
        return timeList;
    }
    
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllErrorP2C/{date}/{time}",  produces="application/json")
    public List<RpErrorsdto> getAllErrorP2C(@PathVariable("date") String Date,@PathVariable("time") String Time) {                        
        List<RpErrorsdto> timeList = typeErrorService.getAllErrorP2C(Date,Time);         
        return timeList;
    }
    
    
    
}
