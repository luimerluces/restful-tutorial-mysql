package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.AllSumdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdOperationsP2C;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ApprovedChannelRepositoryP2C extends JpaRepository<RpdOperationsP2C, Long> {    
   @Query(value ="select distinct(date_proccess) from RPD_OPERATIONSP2C where IDTYPE=?1 and TYPE='P2C' order by date_proccess desc",nativeQuery = true)
   List<String> getAllDateApprovedP2C(String IDREPORT);
   
   @Query(value ="select distinct(time_proccess) from RPD_OPERATIONSP2C where IDTYPE=?2 and TYPE='P2C' and date_proccess=?1 order by date_proccess desc" ,nativeQuery = true)
   List<String> getAllTimeApprovedP2C(String Time,int TypeReport);
   
   @Query(value ="select description,date_proccess,time_proccess,numregister,amountbs,coderror,detail from RPD_OPERATIONSP2C where TYPE='P2C' and date_proccess=?1 and time_proccess=?2 and idtype=?3 order by description ASC" ,nativeQuery = true)
   List<RpOperationsdto> getAllApprovedRejectedP2C(String Date,String Time,int TypeReport);   
   
   @Query(value ="select * from rpd_operationsp2c where idtype in (12,13,14)and date_proccess=?1 and time_proccess=?2" ,nativeQuery = true)
   List<RpdOperationsP2C>getAllSUMP2C(String Date,String Time,int TypeReport1,int TypeReport2,int TypeReport3);   
   
   
   
}
