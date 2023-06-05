package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.Productdto;
import com.example.restfultutorialmysql.entity.Product;
import java.util.List;
public interface ProductService {    
    //GET
    List<Product> getAllData();       
    
}
