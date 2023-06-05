package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdOperationsP2P;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ApprovedChannelRepositoryP2P extends JpaRepository<RpdOperationsP2P, Long> {    
   @Query(value ="select distinct(date_proccess) from RPD_OPERATIONSP2P where IDTYPE=?1 and TYPE='P2P' order by date_proccess desc",nativeQuery = true)
   List<String> getAllDateApprovedP2P(String IDREPORT);
   
   @Query(value ="select distinct(time_proccess) from RPD_OPERATIONSP2P where IDTYPE=?2 and TYPE='P2P' and date_proccess=?1 order by date_proccess desc" ,nativeQuery = true)
   List<String> getAllTimeApprovedP2P(String Time,int TypeReport);
   
   @Query(value ="select description,date_proccess,time_proccess,numregister,amountbs,coderror,detail from RPD_OPERATIONSP2P where TYPE='P2P' and date_proccess=?1 and time_proccess=?2 and idtype=?3 order by description ASC" ,nativeQuery = true)
   List<RpOperationsdto> getAllApprovedRejectedP2P(String Date,String Time,int TypeReport);   
   
}
