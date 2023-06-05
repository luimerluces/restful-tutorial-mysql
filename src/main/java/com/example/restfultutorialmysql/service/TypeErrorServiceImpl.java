package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.entity.Type_Error_Rp;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.dto.TypeErrordto;
import java.util.List;
import com.example.restfultutorialmysql.repository.TypeErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
public class TypeErrorServiceImpl implements TypeErrorService{
    @Autowired
    TypeErrorRepository typeErrorRepository;
    @Override    
    
    public List<Type_Error_Rp> getAllData() {
        return typeErrorRepository.findAll();
    }
    
    public List<String> getAllDateErrorP2P(String IDREPORT) {
        return typeErrorRepository.findAllDateErrorP2P(IDREPORT);
    }
    
    public List<String> getAllDateErrorP2C(String IDREPORT) {
        return typeErrorRepository.findAllDateErrorP2C(IDREPORT);
    }
    
    public List<String> getAllTimeErrorP2C(String IDREPORT) {
        return typeErrorRepository.findAllTimeErrorP2C(IDREPORT);
    }
    
    public List<String> getAllTimeErrorP2P(String Date) {
        return typeErrorRepository.findAllTimeErrorP2P(Date);
    }
    
    public List<RpErrorsdto> getAllErrorP2P(String Date,String Time) {
        return typeErrorRepository.getAllErrorP2P(Date,Time);
    }
    
    public List<RpErrorsdto> getAllErrorP2C(String Fecha,String Hora) {
        return typeErrorRepository.getAllErrorP2C(Fecha,Hora);
    }
    
    public List<TypeErrordto> getAllTypeError() {
        return typeErrorRepository.getAllTypeError();
    }
    
    
    
    
    
}
