package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.Time;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.entity.RpDcsErrorP2P;
import com.example.restfultutorialmysql.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.example.restfultutorialmysql.service.RpErrorP2PServiceImpl;
import java.util.ArrayList;
@RestController
public class ControllerRpErrorP2P {
    @Autowired
    RpErrorP2PServiceImpl RpErrorP2PService;
    @CrossOrigin(origins = "*")    
    @GetMapping(value = "/getAllDateRpErrorP2P/{IDREPORT}",  produces="application/json")
    public List<Dates> getAllDateRpErrorP2P(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = RpErrorP2PService.getAllDateRpErrorP2P(IDREPORT); 
        List<Dates> listDate = new ArrayList<Dates>();
         for (String n : dateList) {
             Dates date = new Dates();
             date.setDates(n);
             listDate.add(date);
         }
         return listDate;
    }   
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeRpErrorP2P/{Dates}/{IDREPORT}",  produces="application/json")
    public List<Time> getAllTimeRpErrorP2P(@PathVariable("Dates") String Dates,@PathVariable("IDREPORT") String IDREPORT) {
        List<String> TimeList = RpErrorP2PService.getAllTimeRpErrorP2P(Dates,IDREPORT); 
        List<Time> listTime = new ArrayList<Time>();
         for (String n : TimeList) {
             Time time = new Time();
             time.setTime(n);
             listTime.add(time);
         }
         return listTime;
    }   
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllRpErrorP2P/{dates}/{Time}/{IDREPORT}",  produces="application/json")
    public List<RpErrorsdto> getAllRpErrorP2P(@PathVariable("dates") String dates,@PathVariable("Time") String Time,@PathVariable("IDREPORT") String IDREPORT) {                        
        List<RpErrorsdto> ErrorList = RpErrorP2PService.getAllRpErrorP2P(dates,Time,IDREPORT);         
        return ErrorList;
    }    
}
