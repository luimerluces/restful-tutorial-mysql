package com.example.restfultutorialmysql.dto;
import java.io.Serializable;
public class Time implements Serializable {
    private static final long serialVersionUID = 1L;    

    private String Time; 
    
    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
    
   
}
