package com.example.restfultutorialmysql.dto;

import java.io.Serializable;

public class DateError implements Serializable {
    private static final long serialVersionUID = 1L;    
    private String date; 
    public String getDate() {
        return date;
    }
    public void setDate(String fecha) {
        this.date = date;
    }
}
