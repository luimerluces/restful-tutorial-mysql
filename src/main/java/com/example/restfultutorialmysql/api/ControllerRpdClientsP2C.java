package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.Dates;
import com.example.restfultutorialmysql.dto.Time;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.service.RpdClientsServiceImplP2C;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;  
import com.example.restfultutorialmysql.service.RpdClientsServiceP2P;
@RestController
public class ControllerRpdClientsP2C {
    @Autowired
    RpdClientsServiceImplP2C RpdClientsService;
       
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllDateP2C/{IDREPORT}",  produces="application/json")
    public List<Dates> getDateP2C(@PathVariable("IDREPORT") String IDREPORT) {
        List<String> dateList = RpdClientsService.getAllDateP2C(IDREPORT); 
        List<Dates> listDate = new ArrayList<Dates>();
         for (String n : dateList) {
             Dates date = new Dates();
             date.setDates(n);
             listDate.add(date);
         }
         return listDate;
    }
    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllTimeP2C/{dates}",  produces="application/json")
    public List<Time> getTimeP2C(@PathVariable("dates") String Dates) {                
        List<String> timeList = RpdClientsService.getAllTimeP2C(Dates);
        List<Time> listTime = new ArrayList<Time>();
         for (String n : timeList) {
             Time time = new Time();
             time.setTime(n);
             listTime.add(time);
         }
         return listTime;
    }    

    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/getAllClientsP2C/{dates}/{time}",  produces="application/json")
    public List<RpClientsdto> getAllClientP2C(@PathVariable("dates") String Dates,@PathVariable("time") String Time) {                        
        List<RpClientsdto> timeList = RpdClientsService.getAllCLientP2C(Dates,Time);         
        return timeList;
    }    
}