package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpErrorsdto;
import com.example.restfultutorialmysql.entity.RpDcsErrorP2P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
public interface RpErrorRepositoryP2P extends JpaRepository<RpDcsErrorP2P, Long>{

    @Query(value ="select distinct(date_proccess) from RP_DCS_ERRORP2P where IDTYPE=?1 and TYPE='P2P' order by date_proccess desc",nativeQuery = true)
    public List<String> findByDateRpErrorP2P(String IDREPORT);
    
    @Query(value ="select distinct(time_proccess) from RP_DCS_ERRORP2P where IDTYPE=?2 and date_proccess=?1 and TYPE='P2P' order by time_proccess desc",nativeQuery = true)
    public List<String> findByTimeRpErrorP2P(String Dates,String IDREPORT);
    
    @Query(value ="select RP_DCS_ERRORP2P.IDtype,RP_DCS_ERRORP2P.Numregister,RP_DCS_ERRORP2P.AmountBS,RP_DCS_ERRORP2P.Description,RP_DCS_ERRORP2P.detail,RP_DCS_ERRORP2P.CODERROR from RP_DCS_ERRORP2P where IDTYPE=?3 and date_proccess=?1 and time_proccess=?2 and TYPE='P2P' order by time_proccess desc",nativeQuery = true)
    public List<RpErrorsdto> findByAllRpErrorP2P(String Dates,String Time,String IDREPORT);    
    
}
