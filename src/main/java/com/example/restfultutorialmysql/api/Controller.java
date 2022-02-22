package com.example.restfultutorialmysql.api;

import com.example.restfultutorialmysql.entity.DataExample;
import com.example.restfultutorialmysql.service.DataExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    //after every call to the endpoint we will do dataExampleService.method(methodParam);
    @Autowired
    DataExampleServiceImpl dataExampleService;

    //get all the data from the database using the service
    //once the call is successful respond with an OK status
    @GetMapping("/data")
    public ResponseEntity<List<DataExample>> getData(){
        return new ResponseEntity<List<DataExample>>(dataExampleService.getAllData(), HttpStatus.OK);
    }
    //you can also just get all the data
    //without making a ResponseEntity object
//    @GetMapping("/data")
//    public List<RandomData> getData(){
//        return dataService.getRandomData();
//    }

    //save the data you send and return CREATED
    //valid docs: https://commons.apache.org/proper/commons-lang/javadocs/api-3.1/org/apache/commons/lang3/Validate.html
    //difference with @Validated: https://stackoverflow.com/questions/36173332/difference-between-valid-and-validated-in-spring
    //ReQuestBody means you are expected to introduce data into your request
    @PostMapping("/data")
    public ResponseEntity<DataExample> saveDate(@Validated @RequestBody DataExample dataExample){
        return new ResponseEntity<>(dataExampleService.saveData(dataExample), HttpStatus.CREATED);
    }

    //update the data
    @PutMapping("/data")
    public ResponseEntity<DataExample> updateData(@RequestBody DataExample dataExample){
        return new ResponseEntity<>(dataExampleService.updateDate(dataExample), HttpStatus.OK);
    }

    //delete the data
    //PathVariable means you are expected to pass a parameter/variable
    //{id} translates into the Long id that you interact with afterwards
    @DeleteMapping("/data/{id}")
    public ResponseEntity<HttpStatus> deleteData(@PathVariable Long id){
        dataExampleService.deleteDataById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
