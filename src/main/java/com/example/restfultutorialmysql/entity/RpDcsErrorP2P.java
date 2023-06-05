package com.example.restfultutorialmysql.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RpDcsErrorP2P {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;    
    
    @Column(name = "IDTYPE", nullable = false)
    private Integer idtype;        
    
    @Column(name = "Type", nullable = false)
    private String type;    
    
    @Column(name = "DESCRIPTION", nullable = false)
    private String DESCRIPTION;        
    
    @Column(name = "NUMREGISTER", nullable = false)
    private Integer numregister;    
    
    @Column(name = "date_proccess", nullable = false)
    private String date_proccess;   
    
    @Column(name = "Time_Proccess", nullable = false)
    private String time_proccess;   
    
    @Column(name = "CODERROR", nullable = true)
    private String coderror;       
    
    @Column(name = "AmountBS",columnDefinition="Decimal(10,2)")
    private Float AmountBS;            
    
    @Column(name = "DETAIL", nullable = true)
    private String detail;    
}
