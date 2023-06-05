package com.example.restfultutorialmysql.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id    
    @Column(name = "PRODUCT_CODE", nullable = false)    
    private String productcode;   
    
    @NonNull
    @Column(name = "PRODUCT_DESCRIPTION", nullable = false)    
    private String productdescription;

}
