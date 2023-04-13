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
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_CODE", nullable = false)
    private String bankcode;
    @NonNull
    @Column(name = "C2P_STATUS", nullable = false)
    private String c2pstatus;
    @NonNull
    @Column(name = "BANK_DESCRIPTION", nullable = false)    
    private String bankdescription;
    @NonNull
    @Column(name = "P2C_STATUS", nullable = false)
    private String p2cstatus;
    @NonNull
    @Column(name = "P2P_STATUS", nullable = false)
    private String p2pstatus;
    @NonNull
    @Column(name = "B2B_STATUS", nullable = false)
    private String b2bstatus;
    
}
