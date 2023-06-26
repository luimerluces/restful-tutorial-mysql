package com.example.restfultutorialmysql.service;

import com.example.restfultutorialmysql.dto.AllSumdto;
import com.example.restfultutorialmysql.entity.RpdOperationsP2C;
import java.util.List;

public interface ApprovedChannelServiceP2C {
//GET
    List<String> getAllDateApprovedP2C(String IDREPORT);
    List<RpdOperationsP2C>getAllSUMP2C(String Date, String Time,int TypeReport1,int TypeReport2,int TypeReport3);
    
}
