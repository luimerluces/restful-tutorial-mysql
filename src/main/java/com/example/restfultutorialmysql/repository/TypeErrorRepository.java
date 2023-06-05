package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.dto.TypeErrordto;
import com.example.restfultutorialmysql.entity.Type_Error_Rp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface TypeErrorRepository extends JpaRepository<Type_Error_Rp, Long>{    
    @Query(value ="select distinct(date) from RP_DCS_ERRORP2P where TYPE='P2P' AND IDTYPE=?1 order by date",nativeQuery = true)
    public List<String> findAllDateErrorP2P(String IDREPORT);
    
    @Query(value ="select distinct(date) from RP_DCS_ERRORP2C where TYPE='P2C' AND IDTYPE=?1 order by date",nativeQuery = true)
    public List<String> findAllDateErrorP2C(String IDREPORT);
    
    @Query(value ="select distinct(time) from RP_DCS_ERRORP2P where TYPE='P2P' AND DATE=?1 order by date",nativeQuery = true)
    public List<String> findAllTimeErrorP2P(String Date);       
    
    @Query(value ="select distinct(time) from RP_DCS_ERRORP2C where TYPE='P2C' AND Date=?1 order by date",nativeQuery = true)
    public List<String> findAllTimeErrorP2C(String Date);   
        
    @Query(value ="select time,date,numregister,description from RP_DCS_ERRORP2P where date=?1 and time=?2 and TYPE='P2P'",nativeQuery = true)
    public List<RpErrorsdto> getAllErrorP2P(String Date , String Time); 
    
    @Query(value ="select time,date,numregister,description from RP_DCS_ERRORP2C where date=?1 and time=?2 and TYPE='P2C'",nativeQuery = true)
    public List<RpErrorsdto> getAllErrorP2C(String Date , String Time); 
    
    @Query(value ="select * from type_error_rp where status=1",nativeQuery = true)
    public List<TypeErrordto> getAllTypeError();     
    
}
