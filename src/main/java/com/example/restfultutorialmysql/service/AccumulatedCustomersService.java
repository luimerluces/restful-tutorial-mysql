package com.example.restfultutorialmysql.service;
import com.example.restfultutorialmysql.dto.RpClientsdto;
import com.example.restfultutorialmysql.dto.RpOperationsdto;
import com.example.restfultutorialmysql.entity.RpdClientsP2C;
import com.example.restfultutorialmysql.entity.RpdClientsP2P;
import java.util.List;

public interface AccumulatedCustomersService {     
     /*************************************************************P2P TIME Y TIMEERROR*********************************************************/////    
     String getAllAccumulatedCustomersOneP2P(String DateReport);       
     String getAllAccumulatedOperationOneP2P(String DateReport, String Graphics); 
     String getAllAccumulatedErrorOneP2P(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersTwoP2P(String DateReport);
     String getAllAccumulatedOperationTwoP2P(String DateReport, String Graphics);
     String getAllAccumulatedErrorTwoP2P(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersThreeP2P(String DateReport); 
     String getAllAccumulatedOperationThreeP2P(String DateReport, String Graphics);
     String getAllAccumulatedErrorThreeP2P(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersFourP2P(String DateReport);  
     String getAllAccumulatedOperationFourP2P(String DateReport, String Graphics);
     String getAllAccumulatedErrorFourP2P(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersFiveP2P(String DateReport);   
     String getAllAccumulatedOperationFiveP2P(String DateReport, String Graphics);
     String getAllAccumulatedErrorFiveP2P(String DateReport, String graphicsError);
     /*************************************************************P2C TIME Y TIMEERROR*********************************************************////    
     String getAllAccumulatedCustomersOneP2C(String DateReport); 
     String getAllAccumulatedOperationOneP2C(String DateReport, String Graphics);
     String getAllAccumulatedErrorOneP2C(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersTwoP2C(String DateReport); 
     String getAllAccumulatedOperationTwoP2C(String DateReport, String Graphics);
     String getAllAccumulatedErrorTwoP2C(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersThreeP2C(String DateReport);
     String getAllAccumulatedOperationThreeP2C(String DateReport, String Graphics);
     String getAllAccumulatedErrorThreeP2C(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersFourP2C(String DateReport); 
     String getAllAccumulatedOperationFourP2C(String DateReport, String Graphics);
     String getAllAccumulatedErrorFourP2C(String DateReport, String graphicsError);
     String getAllAccumulatedCustomersFiveP2C(String DateReport); 
     String getAllAccumulatedOperationFiveP2C(String DateReport, String Graphics);
     String getAllAccumulatedErrorFiveP2C(String DateReport, String graphicsError);
     /*************************************************************P2P GRAFICAS*********************************************************////    
     List<RpClientsdto>getAccumulatedClientsP2P(String DateReport,String TimeStart,String TimeEnd); 
     List<RpClientsdto>getAccumulatedClientsP2C(String DateReport,String TimeStart,String TimeEnd); 
     List<RpOperationsdto>getAccumulatedOperationsP2P(String DateReport,String TimeStart,String TimeEnd, String Graphics); 
     List<RpOperationsdto>getAccumulatedOperationsP2C(String DateReport,String TimeStart,String TimeEnd, String Graphics); 
     List<RpOperationsdto>getAccumulatedGraphicsErrorP2P(String DateReport,String TimeStart,String TimeEnd, String graphicsError); 
     List<RpOperationsdto>getAccumulatedGraphicsErrorP2C(String DateReport,String TimeStart,String TimeEnd, String graphicsError);


}
