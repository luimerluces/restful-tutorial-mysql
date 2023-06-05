package com.example.restfultutorialmysql.api;
import com.example.restfultutorialmysql.entity.Product;
import com.example.restfultutorialmysql.response.MessageResponse;
import com.example.restfultutorialmysql.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class ControllerProduct {
    @Autowired   
    ProductServiceImpl productService;    
    @CrossOrigin(origins = "*")   
    @GetMapping(value = "/Products",  produces="application/json")
    public List<Product> getAllProducts() {                        
        List<Product> productdList = productService.getAllData();         
        return productdList;
    }
}
