package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.entity.RpdClientsP2P;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface RpdClientsRepositoryP2P extends JpaRepository<RpdClientsP2P, Long> {    
   
   @Query(value ="select distinct(date_proccess) from RPD_CLIENTSP2P WHERE TYPE='P2P' and idtype=?1 order by date_proccess",nativeQuery = true)
   List<String> findByDateP2P(String IDREPORT);

   @Query(value ="select time_proccess from RPD_CLIENTSP2P where TYPE='P2P' and date_proccess=?1 and idtype='1' AND DESCRIPTION IN ('AFILIADO','DESAFILIADOS') GROUP by time_proccess order by date_proccess asc",nativeQuery = true)
   List<String> findByTimeP2P(String startDate);
   
   @Query(value ="select time_proccess,date_proccess,numregister,description,idtype from RPD_CLIENTSP2P where date_proccess=?1 and time_proccess=?2 and TYPE='P2P'",nativeQuery = true)
   List<RpClientsdto> getAllCLientP2P(String date,String time);
}
