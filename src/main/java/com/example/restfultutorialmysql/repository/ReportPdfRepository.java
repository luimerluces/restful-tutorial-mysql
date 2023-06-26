package com.example.restfultutorialmysql.repository;
import com.example.restfultutorialmysql.dto.FormatReportdto;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.entity.RpdClientsP2P;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
public interface ReportPdfRepository extends JpaRepository<RpdClientsP2P, Long>{
    @Query(value ="select description,SUM(nuMREGISTER) as NumRegister from RPD_CLIENTSP2P WHERE DATE_PROCCESS=?1 AND TIME_PROCCESS>='00:00:00' AND  TIME_PROCCESS<='18:00:00' GROUP BY DESCRIPTION",nativeQuery = true)
    List<RpClientsdto> getAllAccumulatedClientsPDF_P2P(String Date);    
       
    @Query(value ="select description,SUM(nuMREGISTER) as NumRegister from RPD_CLIENTSP2C WHERE DATE_PROCCESS=?1 AND TIME_PROCCESS>='00:00:00' AND  TIME_PROCCESS<='18:00:00' GROUP BY DESCRIPTION",nativeQuery = true)
    List<RpClientsdto> getAllAccumulatedClientsPDF_P2C(String Date);            
    
    @Query(value ="select SUM(AMOUNTBS) as AmountBs,SUM(nuMREGISTER) as NumRegister from rpd_operationsp2p WHERE DATE_PROCCESS=?1 AND TIME_PROCCESS>='00:00:00' AND  TIME_PROCCESS<='18:00:00' AND description='TOTAL DE TRANSACIONES APROBADAS' GROUP BY DESCRIPTION",nativeQuery = true)
    List<FormatReportdto> getAllAprobadaTotalP2P(String Date);                
    
    @Query(value ="select rpd_operationsp2p.detail,SUM(AMOUNTBS) as AmountBs,SUM(nuMREGISTER) as NumRegister from rpd_operationsp2p where rpd_operationsp2p.description='TOTAL DE TRANSACIONES RECHAZADAS' AND DATE_PROCCESS='2023-05-12' AND TIME_PROCCESS>='00:00:00' AND  TIME_PROCCESS<='18:00:00' GROUP BY rpd_operationsp2p.detail",nativeQuery = true)
    List<FormatReportdto> getAllRechazadaTotalP2P(String Date);            
}
