package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.entity.RpdClientsP2C;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface RpdClientsRepositoryP2C extends JpaRepository<RpdClientsP2C, Long> {    
   @Query(value ="select distinct(date_proccess) from RPD_CLIENTSP2C WHERE TYPE='P2C' and idtype=?1 order by date_proccess",nativeQuery = true)
   List<String> findByDateP2C(String IDREPORT);

   @Query(value ="select time_proccess from RPD_CLIENTSP2C where TYPE='P2C' and date_proccess=?1 and idtype='1' AND DESCRIPTION IN ('AFILIADO','DESAFILIADOS') GROUP by time_proccess order by date_proccess asc",nativeQuery = true)
   List<String> findByTimeP2C(String date);

   @Query(value ="select time_proccess,date_proccess,numregister,description,idtype from RPD_CLIENTSP2C where date_proccess=?1 and time_proccess=?2 and TYPE='P2C'",nativeQuery = true)
   List<RpClientsdto> getAllCLientP2C(String fecha,String hora);
}
