package com.example.restfultutorialmysql.entity;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
        name = "UpdateBusineesRulesStatus",
        procedureName = "UpdateBusineesRules_Status",
        parameters = { 
            @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "p_PRODUCTCODE"),                         
            @StoredProcedureParameter(mode = ParameterMode.OUT, type = Integer.class, name = "p_rowcount")
          }
        )
})
public class Business_Rules implements Serializable {    
    @Column(name = "CHANNEL_CODE", nullable = true)    
    private String channelcode;      
    
    @Column(name = "MODALITY_CODE", nullable = true)    
    private String modalitycode;  
    
    @Id    
    @Column(name = "PRODUCT_CODE", nullable = true)    
    private String productcode;  
    
    @Column(name = "AMOUNT_MAX_SMS", nullable = true)    
    private float amountmaxsms;  
    
    @Column(name = "AMOUNT_MIN_SMS", nullable = true)    
    private float  amountminsms;     
    
    @Column(name = "CREDIT_CODE", nullable = true)    
    private String creditcode;  
    
    @Column(name = "DEBIT_CODE", nullable = true)    
    private String debitcode;  
    
    @Column(name = "FIXED_AMOUNT_COMMISSION", nullable = true)    
    private float fixedamountcommission;          
    
    @Column(name = "IND_COMMISSION", nullable = true)    
    private String indcommission;      
    
    @Column(name = "LIMIT_AMOUNT_COMMISSION", nullable = true)    
    private float limitamountcommission;      
    
    @Column(name = "RATE_COMMISSION", nullable = true)    
    private float ratecomission;          
    
    @Column(name = "SERIAL_CODE", nullable = true)    
    private String serialcode;      
    
    @Column(name = "STATUS", nullable = true)    
    private String status;   
    
    @Column(name = "TRANS_LIMIT_DAILY", nullable = true)    
    private int translimitdaily;   
    
    @Column(name = "USER_POOL", nullable = true)    
    private String userpool;   
    
    @Column(name = "CREDIT_CODE_COMMISSION", nullable = true)    
    private String creditcodecommission;   
    
    @Column(name = "CREDIT_CODE_COMMISSION_IMP", nullable = true)    
    private String creditcodecommissionimp;   
    
    @Column(name = "DEBIT_CODE_COMMISSION", nullable = true)    
    private String debitcodecommission; 
    
    @Column(name = "DEBIT_CODE_COMMISSION_IMP", nullable = true)    
    private String debitcodecommissionimp;     
    
    @Column(name = "FIXED_AMOUNT_COMMISSION_IMP", nullable = true)    
    private float fixedamountcommissionimp; 
    
    @Column(name = "IND_COMMISSION_IMP", nullable = true)    
    private String indcommissionimp;     
    
    @Column(name = "LIMIT_AMOUNT_COMMISSION_IMP", nullable = true)    
    private float limitamountcommissionimp;         
    
    @Column(name = "RATE_COMMISSION_IMP", nullable = true)    
    private float ratecommissionimp;     

    @Column(name = "SERIAL_COMMISSION", nullable = true)    
    private String serialcommission;     
    
    @Column(name = "SERIAL_COMMISSION_IMP", nullable = true)    
    private String serialcommssionimp;             
}
