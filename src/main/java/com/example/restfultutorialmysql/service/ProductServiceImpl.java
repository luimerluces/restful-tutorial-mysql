package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.Productdto;
import com.example.restfultutorialmysql.entity.Product;
import com.example.restfultutorialmysql.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;    
    @Override
    public List<Product> getAllData() {
         return productRepository.findAllProduct();
    }
}
