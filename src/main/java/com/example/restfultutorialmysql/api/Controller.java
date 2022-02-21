package com.example.restfultutorialmysql.api;

import com.example.restfultutorialmysql.entity.DataExample;
import com.example.restfultutorialmysql.service.DataExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController annotation will make this class the controller
//meaning that it's listening to htttp://localhost:8080 calls
//and replying with whatever endpoints you have made
@RestController
//if you want to add the api version, which is good practice
//add this annotation
//localhost:8080/api/v1
//@RequestMapping("api/v1")
public class Controller {

    //we inject the service bean
    //and use it to handle the data
    @Autowired
    DataExampleServiceImpl dataExampleService;

    //get all the data from the database using the service
    //once the call is successful respond with an OK status
    @GetMapping("/data")
    public ResponseEntity<List<DataExample>> getData(){
        return new ResponseEntity<List<DataExample>>(dataExampleService.getAllData(), HttpStatus.OK);
    }
}
