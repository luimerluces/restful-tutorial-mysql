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
public class Affiliation {    
    @Id    
    @Column(name = "CUSTOMER", nullable = false)    
    private String customer;    
    
    @Column(name = "PRODUCT_CODE", nullable = false)
    private String product_code;
    
    @Column(name = "TELEPHONE", nullable = false)
    private String telephone;    
    
    @Column(name = "TYPE_CUSTOMER", nullable = false)
    private String Type_customer;    
    
    @Column(name = "INSTRUMENT", nullable = false)
    private String Instrument;
    
    @Column(name = "TRANS_LIMIT_DAILY", nullable = false)
    private String  Trans_limit_daily;    
    
    @Column(name = "AMOUNT_LIMIT_DAILY", nullable = false)
    private String  Amount_limit_daily;   
    
    @Column(name = "AMOUNT_MAX_TRANS_SMS", nullable = false)
    private String  Amount_max_trans_sms;   
    
    @Column(name = "AMOUNT_MIN_TRANS_SMS", nullable = false)
    private String  Amount_min_trans_sms;      
    
    @Column(name = "COUNT_TRANS", nullable = false)
    private String  Count_Trans;     
    
    @Column(name = "COUNT_AMOUNT", nullable = false)
    private String  Count_Amount;        
    
    @Column(name = "STATUS", nullable = false)
    private String  Status;        
    
    @Column(name = "CREATED_AT", nullable = false)
    private String  Created_at;        
    
    @Column(name = "UPDATED_AT", nullable = false)
    private String  Updated_at;        
    
}
