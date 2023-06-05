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
public class Type_Operations_Rp{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer ID;
    @NonNull
    @Column(name = "TYPE_REPORT", nullable = false)
    private String type_report;    
    @NonNull
    @Column(name = "STATUS", nullable = false)    
    private Integer status;    
}
