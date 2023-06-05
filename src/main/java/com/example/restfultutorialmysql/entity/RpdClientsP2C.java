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
public class RpdClientsP2C implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;    
    @NonNull
    @Column(name = "TYPE", nullable = false)
    private String type;
    @NonNull
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @NonNull
    @Column(name = "NUMREGISTER", nullable = false)
    private Integer numregister;
    @NonNull
    @Column(name = "DATE_PROCCESS", nullable = false)
    private String date_proccess;
    @NonNull
    @Column(name = "TIME_PROCCESS", nullable = false)
    private String time_proccess;
    @Column(name = "IDTYPE", nullable = false)
    private Integer idtype;    
    
}
