package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.Affiliation;
import com.example.restfultutorialmysql.entity.RpdClientsP2C;
import com.example.restfultutorialmysql.entity.RpdClientsP2P;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface AccumulatedCustomersRepository extends JpaRepository<RpdClientsP2C, Long>{    
    /***************************************************************************P2P TIME Y TIMEERROR**********************************************************///
    @Query(value ="select count(type) as corte1 from RPD_CLIENTSP2P where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedCustomersOneP2P(String DateReport);    
    
    @Query(value ="select count(type) as corte1 from RPD_OPERATIONSP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationOneP2P(String DateReport,String Graphics);        
    
    @Query(value ="select count(type) as corte1 from RP_DCS_ERRORP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorOneP2P(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte2 from RPD_CLIENTSP2P where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersTwoP2P(String DateReport);    
    
    @Query(value ="select count(type) as corte2 from RPD_OPERATIONSP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationTwoP2P(String DateReport,String Graphics);        
    
    @Query(value ="select count(type) as corte2 from RP_DCS_ERRORP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorTwoP2P(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte3 from RPD_CLIENTSP2P where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersThreeP2P(String DateReport);
    
    @Query(value ="select count(type) as corte3 from RPD_OPERATIONSP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationThreeP2P(String DateReport,String Graphics);        
    
    @Query(value ="select count(type) as corte3 from RP_DCS_ERRORP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorThreeP2P(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte4 from RPD_CLIENTSP2P where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersFourP2P(String DateReport);
    
    @Query(value ="select count(type) as corte4 from RPD_OPERATIONSP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationFourP2P(String DateReport,String Graphics);        
 
    @Query(value ="select count(type) as corte4 from RP_DCS_ERRORP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorFourP2P(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte5 from RPD_CLIENTSP2P where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersFiveP2P(String DateReport);    
    
    @Query(value ="select count(type) as corte5 from RPD_OPERATIONSP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationFiveP2P(String DateReport,String Graphics);        
 
    @Query(value ="select count(type) as corte5 from RP_DCS_ERRORP2P where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorFiveP2P(String DateReport,String graphicsError);        
    
    
    /***************************************************************************P2C TIME Y TIMEERROR ***********************************************************////
    
    @Query(value ="select count(type) as corte1 from RPD_CLIENTSP2C where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedCustomersOneP2C(String DateReport);  
    
    @Query(value ="select count(type) as corte1 from RPD_OPERATIONSP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationOneP2C(String DateReport,String Graphics); 
    
    @Query(value ="select count(type) as corte1 from RP_DCS_ERRORP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='06:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorOneP2C(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte2 from RPD_CLIENTSP2C where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersTwoP2C(String DateReport);    
    
    @Query(value ="select count(type) as corte2 from RPD_OPERATIONSP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationTwoP2C(String DateReport,String Graphics); 
   
    @Query(value ="select count(type) as corte2 from RP_DCS_ERRORP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='09:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorTwoP2C(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte3 from RPD_CLIENTSP2C where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersThreeP2C(String DateReport);
    
    @Query(value ="select count(type) as corte3 from RPD_OPERATIONSP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationThreeP2C(String DateReport,String Graphics); 
    
    @Query(value ="select count(type) as corte3 from RP_DCS_ERRORP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='12:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorThreeP2C(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte4 from RPD_CLIENTSP2C where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersFourP2C(String DateReport);
    
    @Query(value ="select count(type) as corte4 from RPD_OPERATIONSP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationFourP2C(String DateReport,String Graphics);
    
    @Query(value ="select count(type) as corte4 from RP_DCS_ERRORP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='15:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorFourP2C(String DateReport,String graphicsError);        
    
    @Query(value ="select count(type) as corte5 from RPD_CLIENTSP2C where idtype=1 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00'",nativeQuery = true)
    public String getAllAccumulatedCustomersFiveP2C(String DateReport); 
    
    @Query(value ="select count(type) as corte5 from RPD_OPERATIONSP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00' ",nativeQuery = true)
    public String getAllAccumulatedOperationFiveP2C(String DateReport,String Graphics);
        
    @Query(value ="select count(type) as corte5 from RP_DCS_ERRORP2C where idtype=?2 and date_proccess=?1 and time_proccess>='00:00:00' and time_proccess<='18:00:00' ",nativeQuery = true)
    public String getAllAccumulatedErrorFiveP2C(String DateReport,String graphicsError);        
    
    /***************************************************************************P2C***********************************************************////        
   @Query(value ="select date_proccess,NumRegister,time_proccess,Description from RPD_CLIENTSP2P where date_proccess=?1 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,Description order by time_proccess asc",nativeQuery = true)
   List<RpClientsdto> getAccumulatedClientsP2P(String DateReport,String TimeStart,String TimeEnd);        
   
   @Query(value ="select date_proccess,NumRegister,time_proccess,Description from RPD_CLIENTSP2C where date_proccess=?1 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,Description order by time_proccess asc",nativeQuery = true)
   List<RpClientsdto> getAccumulatedClientsP2C(String DateReport,String TimeStart,String TimeEnd);        

   @Query(value ="select date_proccess,NumRegister,time_proccess,AmountBs,coderror,Description,detail,idtype from RPD_OPERATIONSP2P where date_proccess=?1 and idtype=?4 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,AmountBs,coderror,Description, detail, idtype order by time_proccess asc",nativeQuery = true)
   List<RpOperationsdto> getAccumulatedOperationsP2P(String DateReport,String TimeStart,String TimeEnd, String Graphics);        
   
   @Query(value ="select date_proccess,NumRegister,time_proccess,AmountBs,coderror,Description,detail,idtype from RPD_OPERATIONSP2C where date_proccess=?1 and idtype=?4 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,AmountBs,coderror,Description, detail, idtype order by time_proccess asc",nativeQuery = true)
   List<RpOperationsdto> getAccumulatedOperationsP2C(String DateReport,String TimeStart,String TimeEnd, String Graphics);        
   
   @Query(value ="select date_proccess,NumRegister,time_proccess,AmountBs,coderror,Description,detail,idtype from RP_DCS_ERRORP2P where date_proccess=?1 and idtype=?4 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,AmountBs,coderror,Description, detail, idtype order by time_proccess asc",nativeQuery = true)
   List<RpOperationsdto> getAccumulatedGraphicsErrorP2P(String DateReport,String TimeStart,String TimeEnd, String graphicsError);        
   
   @Query(value ="select date_proccess,NumRegister,time_proccess,AmountBs,coderror,Description,detail,idtype from RP_DCS_ERRORP2C where date_proccess=?1 and idtype=?4 and time_proccess>=?2 and time_proccess<=?3 GROUP by NumRegister,time_proccess,date_proccess,AmountBs,coderror,Description, detail, idtype order by time_proccess asc",nativeQuery = true)
   List<RpOperationsdto> getAccumulatedGraphicsErrorP2C(String DateReport,String TimeStart,String TimeEnd, String graphicsError);        
   
}
