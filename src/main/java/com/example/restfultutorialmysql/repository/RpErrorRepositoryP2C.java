package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.entity.RpDcsErrorP2C;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
public interface RpErrorRepositoryP2C extends JpaRepository<RpDcsErrorP2C, Long>{

    @Query(value ="select distinct(date_proccess) from RP_DCS_ERRORP2C where IDTYPE=?1 and TYPE='P2C' order by date_proccess desc",nativeQuery = true)
    public List<String> findByDateRpErrorP2C(String IDREPORT);
    
    @Query(value ="select distinct(time_proccess) from RP_DCS_ERRORP2C where IDTYPE=?2 and date_proccess=?1 and TYPE='P2C' order by time_proccess desc",nativeQuery = true)
    public List<String> findByTimeRpErrorP2C(String Dates,String IDREPORT);
    
    @Query(value ="select RP_DCS_ERRORP2C.IDtype,RP_DCS_ERRORP2C.Numregister,RP_DCS_ERRORP2C.AmountBS,RP_DCS_ERRORP2C.Description,RP_DCS_ERRORP2C.detail,RP_DCS_ERRORP2C.CODERROR from RP_DCS_ERRORP2C where IDTYPE=?3 and date_proccess=?1 and time_proccess=?2 and TYPE='P2C' order by time_proccess desc",nativeQuery = true)
    public List<RpErrorsdto> findByAllRpErrorP2C(String Dates,String Time,String IDREPORT);        
}
