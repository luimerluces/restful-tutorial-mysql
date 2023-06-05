package com.example.restfultutorialmysql.entity;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RpdOperationsP2C {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;    
    @Column(name = "TYPE", nullable = false)
    private String type;    
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;        
    @Column(name = "NUMREGISTER", nullable = false)
    private Integer numregister;    
    @Column(name = "DATE_PROCCESS", nullable = false)
    private String date_proccess;   
    @Column(name = "TIME_PROCCESS", nullable = false)
    private String time_proccess;       
    @Column(name = "AmountBS",columnDefinition="Decimal(10,2)")
    private Float amountbs;
    @Column(name = "DETAIL", nullable = true)
    private String detail;        
    @Column(name = "CODERROR", nullable = true)
    private String coderror;        
    @Column(name = "IDTYPE", nullable = false)
    private Integer idtype;    
    
}
