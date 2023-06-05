package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.Time;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.service.RpErrorP2CServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
@RestController
public class ControllerRpErrorP2C {
    @Autowired
    RpErrorP2CServiceImpl RpErrorP2CService;
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllDateRpErrorP2C/{IDREPORT}",  produces="application/json")
    public List<Dates> getAllDateRpErrorP2C(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = RpErrorP2CService.getAllDateRpErrorP2C(IDREPORT);         
        List<Dates> listDate = new ArrayList<Dates>();
         for (String n : dateList) {
             Dates date = new Dates();
             date.setDates(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeRpErrorP2C/{Dates}/{IDREPORT}",  produces="application/json")
    public List<Time> getAllTimeRpErrorP2C(@PathVariable("Dates") String Dates,@PathVariable("IDREPORT") String IDREPORT) {
        List<String> TimeList = RpErrorP2CService.getAllTimeRpErrorP2C(Dates,IDREPORT); 
        List<Time> listTime = new ArrayList<Time>();
         for (String n : TimeList) {
             Time time = new Time();
             time.setTime(n);
             listTime.add(time);
         }
         return listTime;
    }       
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllRpErrorP2C/{dates}/{Time}/{IDREPORT}",  produces="application/json")
    public List<RpErrorsdto> getAllRpErrorP2C(@PathVariable("dates") String dates,@PathVariable("Time") String Time,@PathVariable("IDREPORT") String IDREPORT) {                        
        List<RpErrorsdto> ErrorList = RpErrorP2CService.getAllRpErrorP2C(dates,Time,IDREPORT);         
        return ErrorList;
    }    
}
