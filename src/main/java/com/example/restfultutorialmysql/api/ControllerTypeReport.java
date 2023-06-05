package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.entity.Type_Operations_Rp;
import com.example.restfultutorialmysql.service.TypeReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
public class ControllerTypeReport {
    @Autowired
    TypeReportServiceImpl typeReportService;
    @CrossOrigin(origins = "*")    
    @GetMapping("/TypeReports")
    public ResponseEntity<List<Type_Operations_Rp>> getData(){
        return new ResponseEntity<List<Type_Operations_Rp>>(typeReportService.getAllData(), HttpStatus.OK);
    }  
}
