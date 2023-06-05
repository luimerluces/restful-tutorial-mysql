package com.example.restfultutorialmysql.dto;
import java.io.Serializable;
public class Dates implements Serializable {
    private static final long serialVersionUID = 1L;    
    private String dates; 
    public String getDates() {
        return dates;
    }
    public void setDates(String dates) {
        this.dates = dates;
    }
}