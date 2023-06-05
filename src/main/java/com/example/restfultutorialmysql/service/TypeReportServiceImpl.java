package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.entity.Type_Operations_Rp;
import com.example.restfultutorialmysql.repository.TypeReportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TypeReportServiceImpl implements TypeReportService{
    @Autowired
    TypeReportRepository typeReportRepository;
    public List<Type_Operations_Rp> getAllData() {
         return typeReportRepository.findAll();
    }
    
}
